import java.util.Scanner;
public class MyRubix {

    static String[][] redFace = {
        {"1r","2r","3r"},
        {"4r","5r","6r"},
        {"7r","8r","9r"}
    };

    static String[][] blueFace = {
        {"1b","2b","3b"},
        {"4b","5b","6b"},
        {"7b","8b","9b"}
    };
    
    static String[][] yellowFace = {
        {"1y","2y","3y"},
        {"4y","5y","6y"},
        {"7y","8y","9y"}
    };
    
    static String[][] greenFace = {
        {"1g","2g","3g"},
        {"4g","5g","6g"},
        {"7g","8g","9g"}
    };
    
    static String[][] whiteFace = {
        {"1w","2w","3w"},
        {"4w","5w","6w"},
        {"7w","8w","9w"}
    };
    
    static String[][] orangeFace = {
        {"1o","2o","3o"},
        {"4o","5o","6o"},
        {"7o","8o","9o"}
    };
    
    static String[][][] UserCube = {
        {
            {"1r","2r","3r"},
            {"4r","5r","6r"},
            {"7r","8r","9r"}
        },
        {
            {"1b","2b","3b"},
            {"4b","5b","6b"},
            {"7b","8b","9b"}
        },
        {
            {"1y","2y","3y"},
            {"4y","5y","6y"},
            {"7y","8y","9y"}
        },
        {
            {"1g","2g","3g"},
            {"4g","5g","6g"},
            {"7g","8g","9g"}
        },
        {
            {"1w","2w","3w"},
            {"4w","5w","6w"},
            {"7w","8w","9w"}
        },
        {
            {"1o","2o","3o"},
            {"4o","5o","6o"},
            {"7o","8o","9o"}
        }
    };

    static String[][][] cube = {
        redFace,
        blueFace,
        yellowFace,
        greenFace,
        whiteFace,
        orangeFace
    };

        public static void showCube() {
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void showUserCube(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(UserCube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        showUserCube();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a move (U, U', D, D', L, L', R, R', F, F', B, B') or q to quit: ");
            String move = scanner.nextLine();
            if (move.equals("q")) {
                break;
            }
            makeMove(move);
            showUserCube();
        }
        scanner.close();
    }
    public static void makeMove(String move) {
            switch (move) {
                case "U":
                    //for loop for accessing the array [0][1-3]
                    for(int i = 0; i < 3; i++){
                        UserCube[1][0][i] = redFace[0][i];
                        UserCube[0][0][i] = greenFace[0][i];
                        UserCube[3][0][i] = orangeFace[0][i];
                        UserCube[5][0][i] = blueFace[0][i];
                    }
                case "U'": //Tested
                    for(int i = 0; i < 3; i++){
                        UserCube[1][0][i] = orangeFace[0][i];
                        UserCube[0][0][i] = blueFace[0][i];
                        UserCube[3][0][i] = redFace[0][i];
                        UserCube[5][0][i] = greenFace[0][i];
                    }
                case "D": //Tested
                    for(int i = 0; i < 3; i++){
                        UserCube[1][2][i] = orangeFace[2][i];
                        UserCube[0][2][i] = blueFace[2][i];
                        UserCube[3][2][i] = redFace[2][i];
                        UserCube[5][2][i] = greenFace[2][i];
                    }
                case "D'": //Tested
                    for(int i = 0; i < 3; i++){
                        UserCube[1][2][i] = redFace[2][i];
                        UserCube[0][2][i] = greenFace[2][i];
                        UserCube[3][2][i] = orangeFace[2][i];
                        UserCube[5][2][i] = blueFace[2][i];
                }
                case "R": //Tested
                    for(int i = 0; i < 3; i++){
                        UserCube[1][i][2] = whiteFace[i][2];
                        UserCube[2][i][2] = blueFace[i][2];
                        UserCube[3][i][2] = yellowFace[i][2];
                        UserCube[4][i][2] = greenFace[i][2];
                }

                case "R'": //Tested
                    for(int i = 0; i < 3; i++){
                        UserCube[1][i][2] = yellowFace[i][2];
                        UserCube[2][i][2] = greenFace[i][2];
                        UserCube[3][i][2] = whiteFace[i][2];
                        UserCube[4][i][2] = blueFace[i][2];
                }

                case "L": //Tested
                    for(int i = 0; i < 3; i++){
                        UserCube[1][i][0] = yellowFace[i][0];
                        UserCube[2][i][0] = greenFace[i][0];
                        UserCube[3][i][0] = whiteFace[i][0];
                        UserCube[4][i][0] = blueFace[i][0];
            }
                case "L'": //Tested
                for(int i = 0; i < 3; i++){
                    UserCube[1][i][0] = whiteFace[i][0];
                    UserCube[2][i][0] = blueFace[i][0];
                    UserCube[3][i][0] = yellowFace[i][0];
                    UserCube[4][i][0] = greenFace[i][0];
            }
                case "F": //Tested
                for(int i = 0; i < 3; i++){
                    UserCube[2][2][i] = orangeFace[2][i];
                    UserCube[0][2][i] = yellowFace[2][i];
                    UserCube[5][2][i] = whiteFace[2][i];
                    UserCube[4][2][i] = redFace[2][i];
                }

                case "F'":
                for(int i = 0; i < 3; i++){
                    UserCube[2][2][i] = redFace[2][i];
                    UserCube[0][2][i] = whiteFace[2][i];
                    UserCube[5][2][i] = yellowFace[2][i];
                    UserCube[4][2][i] = orangeFace[2][i];
                }
                case "B":
                for(int i = 0; i < 3; i++){
                    UserCube[2][0][i] = redFace[0][i];
                    UserCube[0][0][i] = whiteFace[0][i];
                    UserCube[5][0][i] = yellowFace[0][i];
                    UserCube[4][0][i] = orangeFace[0][i];
                }
                case "B'":
                for(int i = 0; i < 3; i++){
                    UserCube[2][0][i] = orangeFace[0][i];
                    UserCube[0][0][i] = yellowFace[0][i];
                    UserCube[5][0][i] = whiteFace[0][i];
                    UserCube[4][0][i] = redFace[0][i];
                }

    }
    }
}
    // rotate the face clockwise
