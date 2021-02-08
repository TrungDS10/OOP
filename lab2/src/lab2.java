import java.util.*;
class Box {
    static int WIDTH;
    static int HEIGHT;
    private static Box BOX; 
    private static Collection<Particle> particles;
    static int[][] positionMatrix;

    private Box(int width, int height, int numParticles) {
        Box.WIDTH = width;
        Box.HEIGHT = height;
        positionMatrix = new int[height + 1][width + 1];
        particles = new HashSet<>();
        for (int i = 0; i < numParticles; i++) {
            particles.add(new Particle());
        }
        Box.updatePositionMatrix();
    }
    public static List<int[]> allParticlesMove() {
        for (Particle particle : particles) {
            particle.move();
        }
        Box.updatePositionMatrix();
        return Box.getCollidingPosition();
    }
    private static List<int[]> getCollidingPosition() {
        List<int[]> collidePos = new ArrayList<>();
        int numParticlesAdded = 0;
        for (int i = 0; i <= Box.HEIGHT; i++) {
            for (int j = 0; j <= Box.WIDTH; j++) {
                if (Box.positionMatrix[i][j] <= 1) {
                    continue;
                }
                numParticlesAdded += Box.positionMatrix[i][j] - 1;
                collidePos.add(new int[]{i, j});
            }
        }
        for (int i = 0; i < numParticlesAdded; i++) {
            particles.add(new Particle());
        }
        Box.updatePositionMatrix();
        return collidePos;
    }
    private static void updatePositionMatrix() {
        for (int[] row : positionMatrix) {
            Arrays.fill(row, 0);
        }
        for (Particle particle : particles) {
            positionMatrix[particle.getY()][particle.getX()] += 1;
        }
    }
    /**
     * @param width
     * @param height
     * @param numParticles
     * @return
     * @throws InstantiationException
     */
    public static Box createBox(int width, int height, int numParticles) throws InstantiationException {
        if (BOX == null) {
            BOX = new Box(width, height, numParticles);
            return BOX;
        }
        throw new InstantiationException("Box has already been created !");
    }
    /**
     * @return
     * @throws NullPointerException
     */
    public static Box getBox() throws NullPointerException {
        if (BOX == null) {
            throw new NullPointerException("Cannot get the Box !");
        }
        return BOX;
    }
    public static int getNumParticles() {
        return particles.size();
    }

}
class Particle {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private enum Directions {
        N, NE, E, SE, S, SW, W, NW
    }
    private static final Directions[] DIRECTIONS = Directions.values();
    private static final Random RANDOM = new Random();
    public Particle() {
        this.x = RANDOM.nextInt(Box.WIDTH + 1);
        this.y = RANDOM.nextInt(Box.HEIGHT + 1);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void move() {
        Directions direct = DIRECTIONS[RANDOM.nextInt(8)];
        switch (direct) {
            case N:
                dy = y - 1;
                break;
            case NE:
                dx = x + 1;
                dy = y - 1;
                break;
            case E:
                dx = x + 1;
                break;
            case SE:
                dx = x + 1;
                dy = y + 1;
                break;
            case S:
                dy = y + 1;
                break;
            case SW:
                dx = x - 1;
                dy = y + 1;
                break;
            case W:
                dx = x - 1;
                break;
            case NW:
                dx = x - 1;
                dy = y - 1;
                break;
            default:
                break;
        }
        if (dx < 0 || dy < 0 || dx > Box.WIDTH || dy > Box.HEIGHT) {
            this.move();
        }
        this.x = dx;
        this.y = dy;
    }
}
public class lab2 {
    static void visualizing() {
        for (int i = -1; i <= Box.WIDTH + 1; i++) {
            System.out.print("- ");
        }
        System.out.println();
        for (int i = 0; i <= Box.HEIGHT; i++) {
            for (int j = -1; j <= Box.WIDTH + 1; j++) {
                if (j == -1 || j == Box.WIDTH + 1) {
                    System.out.print("| ");
                    continue;
                }
                if (Box.positionMatrix[i][j] > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = -1; i <= Box.WIDTH + 1; i++) {
            System.out.print("- ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws InstantiationException {
        Scanner sc = new Scanner(System.in);
        Box.createBox(5, 4, 3);
        System.out.println("*STEP 0");
        System.out.println("Number of particles = " + Box.getNumParticles());
        visualizing();
        System.out.println("Enter number of step: ");
        int numStep = sc.nextInt();
        for (int i = 1; i <= numStep; i++) {
            System.out.println("*STEP " + i);
            for (int[] coordinate : Box.allParticlesMove()) {
                System.out.println(
                        String.format(
                                "Collision at [x, y] = [%d, %d] ", coordinate[0], coordinate[1]
                        )
                );
            }
            System.out.println("Number of particles = " + Box.getNumParticles());
            visualizing();
        }
        sc.close();
    }
}