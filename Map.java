public class Map {
    private final char[][] maze1 = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', 'P', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', ' ', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', 'E', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };
    private final char[][] maze2 = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', 'P', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', ' ', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#'},
            {'#', ' ', '#', '#', '#', '#', ' ', '#', ' ', '#'},
            {'#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', '#'},
            {'#', ' ', '#', '#', ' ', '#', '#', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', 'E', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };
    private final char[][] maze3 = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', 'P', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#'},
            {'#', ' ', '#', ' ', '#', '#', '#', '#', ' ', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#'},
            {'#', ' ', '#', '#', ' ', ' ', ' ', 'E', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };
    private final char[][] maze4 = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', 'P', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', '#', '#', '#', '#', '#'},
            {'#', ' ', '#', '#', ' ', '#', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', '#'},
            {'#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', ' ', '#'},
            {'#', 'E', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };
    private final char[][] maze5 = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', 'P', ' ', ' ', '#', '#', '#', '#', ' ', '#'},
            {'#', '#', '#', ' ', '#', ' ', ' ', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', '#', ' ', '#', '#', ' ', '#'},
            {'#', ' ', '#', '#', '#', ' ', '#', ' ', ' ', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', '#', ' ', '#', '#'},
            {'#', ' ', '#', ' ', '#', '#', '#', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#'},
            {'#', '#', '#', ' ', ' ', ' ', ' ', 'E', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };
    private final char[][] emptyMaze={{0},{0}};
    
    public char[][] getMap(String choice){

        char[][] copy = switch (choice) {//делает копию карты
            case "1" -> maze1;
            case "2" -> maze2;
            case "3" -> maze3;
            case "4" -> maze4;
            case "5" -> maze5;
            default -> emptyMaze;
        };
        return copy;

    }
}
