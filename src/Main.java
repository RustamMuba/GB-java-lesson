import Actions.JumpAction;
import Actions.PlayerAction;
import Actions.RunAction;
import Actions.SwimAction;
import Obstacles.Obstacle;
import Obstacles.Pool;
import Obstacles.Racetrack;
import Obstacles.Wall;

import java.util.Random;

public class Main {
    private static final int POOL_DISTANCE = 100;
    private static final int RACETRACK_DISTANCE = 100;
    private static final int WALL_DISTANCE = 5;

    public static void main(String[] args) {
        Course course = new Course(makeObstacles());
        Player[] players = makePlayers();
        team team = new team("Surgut", players);
        course.doIt(team);
        team.printWinners();
    }

    public static Obstacle[] makeObstacles() {
        return new Obstacle[]{
            new Pool(POOL_DISTANCE),
            new Racetrack(RACETRACK_DISTANCE),
            new Wall(WALL_DISTANCE)
        };
    }

    public static Player[] makePlayers() {
        return new Player[] {
            new Player("Рустам", new PlayerAction[] { getSwimAction(), getJumpAction() }),
            new Player("Андрей", new PlayerAction[] { getRunAction() }),
            new Player("Сильвия", new PlayerAction[] { getRunAction(), getJumpAction(), getSwimAction() }),
            new Player("Вика", new PlayerAction[] { getSwimAction() }),
        };
    }

    public static PlayerAction getSwimAction() {
        Random random = new Random();
        SwimAction swimAction = new SwimAction(random.nextInt(POOL_DISTANCE + 50));
        return swimAction;
    }

    public static PlayerAction getJumpAction() {
        Random random = new Random();
        JumpAction jumpAction = new JumpAction(random.nextInt(WALL_DISTANCE + 2));
        return jumpAction;
    }

    public static PlayerAction getRunAction() {
        Random random = new Random();
        RunAction runAction = new RunAction(random.nextInt(RACETRACK_DISTANCE + 50));
        return runAction;
    }
}
