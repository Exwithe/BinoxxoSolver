package com.company.binoxxosolver;

public class Grid {
    //Variables
        //Size of the grid
    private int gridSize = 10;
        //Errors
    private int errors = 0;
        //Grid to solve
    private char[][] mainGrid;

    //Constructors

    public Grid(char[][] userGridinput) {
        this.mainGrid = userGridinput;
    }

    //getter

    public char[][] getMainGrid() {
        return mainGrid;
    }
    public char getIndexMainGrid(int i, int j) {
        return mainGrid[i][j];
    }
    public int getErrors() {
        return errors;
    }

    //methods

        //for console display
    public void printGrid(char[][] grid) {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                System.out.print(grid[i][j]);
            }
            //System.out.println();
        }
        System.out.println();
    }

        //all in one solving method
    public char[][] solveGrid() {
                //methode 1 X_X O_O checker vertical
        for(int i = 0; i < gridSize; i++) {
            for(int j = 1; j < (gridSize-1); j++) {
                if(mainGrid[i][j]==' ' & mainGrid[i][j+1] == 'X' & mainGrid[i][j-1] == 'X') {
                    mainGrid[i][j] = 'O';
                    if (isntTrue() | isntUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                }
                if(mainGrid[i][j]==' ' & mainGrid[i][j+1] == 'O' & mainGrid[i][j-1] == 'O') {
                    mainGrid[i][j] = 'X';
                    if (isntTrue() | isntUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                }
            }
        }
                //method 1 X_X O_O checker horizontal
        for(int i = 0; i < gridSize; i++) {
            for(int j = 1; j < (gridSize-1); j++) {
                if(mainGrid[j][i]==' ' & mainGrid[j+1][i] == 'X' & mainGrid[j-1][i] == 'X') {
                    mainGrid[j][i] = 'O';
                    if (isntTrue() | isntUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                }
                if(mainGrid[j][i]==' ' & mainGrid[j+1][i] == 'O' & mainGrid[j-1][i] == 'O') {
                    mainGrid[j][i] = 'X';
                    if (isntTrue() | isntUnique()) {
                        printGrid(mainGrid);
                        errors = 2;
                    }
                    return mainGrid;
                }
            }
        }
                //methode 1 XX OO checker horizontal
        for(int i = 0;i<gridSize;i++) {
            for (int j = 0; j < (gridSize-1); j++) {
                if(mainGrid[i][j] == 'X' & mainGrid[i][j+1] == 'X') {
                    switch (j) {
                        case 0: {
                            if(mainGrid[i][j+2] == ' ') {
                                mainGrid[i][j+2] = 'O';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                        case 1: case 2: case 3: case 4: case 5: case 6: case 7: {
                            if (mainGrid[i][j - 1] == ' ') {
                                mainGrid[i][j - 1] = 'O';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                            if (mainGrid[i][j + 2] == ' ') {
                                mainGrid[i][j + 2] = 'O';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }break;
                        case 8: {
                            if (mainGrid[i][j - 1] == ' ') {
                                mainGrid[i][j - 1] = 'O';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                    }
                }
                if(mainGrid[i][j] == 'O' & mainGrid[i][j+1] == 'O') {
                    switch (j) {
                        case 0: {
                            if(mainGrid[i][j+2] == ' ') {
                                mainGrid[i][j+2] = 'X';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                        case 1: case 2: case 3: case 4: case 5: case 6: case 7: {
                            if (mainGrid[i][j - 1] == ' ') {
                                mainGrid[i][j - 1] = 'X';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                            if (mainGrid[i][j + 2] == ' ') {
                                mainGrid[i][j + 2] = 'X';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }break;
                        case 8: {
                            if (mainGrid[i][j - 1] == ' ') {
                                mainGrid[i][j - 1] = 'X';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                    }
                }
            }
        }
                //methode 1 XX OO Checker vertical
        for(int i = 0;i<gridSize;i++) {
            for (int j = 0; j <(gridSize-1); j++) {
                if(mainGrid[j][i] == 'X' & mainGrid[j+1][i] == 'X') {
                    switch (j) {
                        case 0: {
                            if(mainGrid[j+2][i] == ' ') {
                                mainGrid[j+2][i] = 'O';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                        case 1: case 2: case 3: case 4: case 5: case 6: case 7: {
                            if (mainGrid[j - 1][i] == ' ') {
                                mainGrid[j - 1][i] = 'O';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                            if (mainGrid[j + 2][i] == ' ') {
                                mainGrid[j + 2][i] = 'O';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }break;
                        case 8: {
                            if (mainGrid[j - 1][i] == ' ') {
                                mainGrid[j - 1][i] = 'O';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                    }
                }
                if(mainGrid[j][i] == 'O' & mainGrid[j+1][i] == 'O') {
                    switch (j) {
                        case 0: {
                            if(mainGrid[j+2][i] == ' ') {
                                mainGrid[j+2][i] = 'X';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                        case 1: case 2: case 3: case 4: case 5: case 6: case 7: {
                            if (mainGrid[j - 1][i] == ' ') {
                                mainGrid[j - 1][i] = 'X';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                            if (mainGrid[j + 2][i] == ' ') {
                                mainGrid[j + 2][i] = 'X';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }break;
                        case 8: {
                            if (mainGrid[j - 1][i] == ' ') {
                                mainGrid[j - 1][i] = 'X';
                                if (isntTrue() | isntUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;

                    }

                }
            }
        }
                // Check if any solution is Possible vertical
        for (int i = 0; i < gridSize; i++) {
            char[] solutoionGrid = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
            char[] checkGrid = new char[gridSize];
            int zero = 0;
            for (int j = 0; j < gridSize; j++) {
                checkGrid[j] = mainGrid[i][j];
                if (checkGrid[j] == ' ') {
                    zero++;
                    checkGrid[j] = '0';
                }
            }
                //checker
            if (isRowColumnTrue(checkGrid) & isUniqueVertical(checkGrid)) {
                for (int l = 0; l < gridSize; l++) {
                    if (solutoionGrid[l] == ' ') {
                        solutoionGrid[l] = checkGrid[l];
                    } else if (checkGrid[l] != solutoionGrid[l]) {
                        solutoionGrid[l] = 'Z';
                    }
                }
            }
            for(int j = 0; j < (Math.pow(2,zero)-1);
                j++) {
                int k = 0;
                while (checkGrid[k] != '0') {
                    if (checkGrid[k] == '1') {
                        checkGrid[k] = '0';
                    }
                    k++;
                }
                checkGrid[k] = '1';
                //checker
                if (isRowColumnTrue(checkGrid) & isUniqueVertical(checkGrid)) {
                    for (int l = 0; l < gridSize; l++) {
                        if (solutoionGrid[l] == ' ') {
                            solutoionGrid[l] = checkGrid[l];
                        } else if (checkGrid[l] != solutoionGrid[l]) {
                            solutoionGrid[l] = 'Z';
                        }
                    }
                }
            }
            for (int l = 0; l < gridSize; l++) {
                if (solutoionGrid[l] == '0') {
                    mainGrid[i][l] = 'O';
                    if (isntTrue() | isntUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                } else if (solutoionGrid[l] == '1') {
                    mainGrid[i][l] = 'X';
                    if (isntTrue() | isntUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                }
            }
        }
                // Check if any solution is Possible horizonal
        for (int i = 0; i < gridSize; i++) {
            char[] solutoionGrid = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
            char[] checkGrid = new char[gridSize];
            int zero = 0;
            for (int j = 0; j < gridSize; j++) {
                checkGrid[j] = mainGrid[j][i];
                if (checkGrid[j] == ' ') {
                    zero++;
                    checkGrid[j] = '0';
                }
            }
                //checker
            if (isRowColumnTrue(checkGrid) & isUsedHorizontal(checkGrid)) {
                for (int l = 0; l < gridSize; l++) {
                    if (solutoionGrid[l] == ' ') {
                        solutoionGrid[l] = checkGrid[l];
                    } else if (checkGrid[l] != solutoionGrid[l]) {
                        solutoionGrid[l] = 'Z';
                    }
                }
            }
            for(int j = 0; j < (Math.pow(2,zero)-1); j++) {
                int k = 0;
                while (checkGrid[k] != '0') {
                    if (checkGrid[k] == '1') {
                        checkGrid[k] = '0';
                    }
                    k++;
                }
                checkGrid[k] = '1';
                //checker
                if (isRowColumnTrue(checkGrid) & isUsedHorizontal(checkGrid)) {
                    for (int l = 0; l < gridSize; l++) {
                        if (solutoionGrid[l] == ' ') {
                            solutoionGrid[l] = checkGrid[l];
                        } else if (checkGrid[l] != solutoionGrid[l]) {
                            solutoionGrid[l] = 'Z';
                        }
                    }
                }
            }
            for (int l = 0; l < gridSize; l++) {
                if (solutoionGrid[l] == '0') {
                    mainGrid[l][i] = 'O';
                    if (isntTrue() | isntUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                } else if (solutoionGrid[l] == '1') {
                    mainGrid[l][i] = 'X';
                    if (isntTrue() | isntUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                }
            }
        }
        //Multiple solution error
        errors = 1;
        return mainGrid;
    }

    //checks if grid is valid
    public boolean isntTrue() {
        boolean isTru = true;
        for (int i = 0; i < gridSize; i++) {
            int five = 0;
            int x = 0;
            int o = 0;
            for (int j = 0; j < gridSize; j++) {
                switch (mainGrid[i][j]) {
                    case 'X':
                        five++;
                        x = 0;
                        o++;
                        break;
                    case 'O':
                        five--;
                        o = 0;
                        x++;
                        break;
                    case ' ':
                        x = 0;
                        o = 0;
                        five = 999;
                }
                if (x >= 3 | o >= 3) {
                    return true;
                }
            }
            if (five != 0 & five < 990) {
                return true;
            }
        }
        for (int i = 0; i < gridSize; i++) {
            int five = 0;
            int x = 0;
            int o = 0;
            for (int j = 0; j < gridSize; j++) {
                switch (mainGrid[j][i]) {
                    case 'X':
                        five++;
                        x = 0;
                        o++;
                        break;
                    case 'O':
                        five--;
                        o = 0;
                        x++;
                        break;
                    case ' ':
                        o = 0;
                        x = 0;
                        five = 999;
                }
                if (o >= 3 | x >= 3) {
                    return true;
                }
            }
            if (five != 0 & five < 990) {
                return true;
            }
        }
        return false;
    }
    //ckecks if all rows/columns are unique
    public boolean isntUnique() {
        boolean isUnique = true;
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < gridSize; k++) {
                    if (mainGrid[i][k] == mainGrid[j][k] & mainGrid[j][k] != ' ' & mainGrid[i][k] != ' ') {
                        if (k == (gridSize-1)) {
                            return true;
                        }
                    } else {
                        k = gridSize;
                    }
                }
            }
        }
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < gridSize; k++) {
                    if (mainGrid[k][i] == mainGrid[k][j] & mainGrid[j][k] != ' ' & mainGrid[i][k] != ' ') {
                        if (k == (gridSize-1)) {
                            return true;
                        }
                    } else {
                        k = gridSize;
                    }
                }
            }
        }
        return false;
    }

    //checks if Row or Column is valid
    public boolean isRowColumnTrue (char[] x) {
        boolean isTru;
        int fuenf = 0;
        int eins = 0;
        int zero = 0;
        for (int j = 0; j < gridSize; j++) {
            switch (x[j]) {
                case '0': case 'O':
                    fuenf++;
                    eins = 0;
                    zero++;
                    break;
                case '1': case 'X':
                    fuenf--;
                    zero = 0;
                    eins++;
                    break;
            }
            if (zero >= 3 | eins >= 3) {
                return false;
            }
        }
        if (fuenf != 0) {
            return false;
        }
        return true;
    }

    //useless now
    public void prtRow(char[] row){
        for (int i = 0; i < gridSize ; i++) {
            System.out.print(row[i]);
        }
        System.out.println();
    }

    //Checks if column is unique
    public boolean isUniqueVertical (char[] row) {
        for(int i = 0; i < gridSize; i++) {
            for(int j = 0; j < gridSize; j++){
                switch (mainGrid[i][j]) {
                    case ' ': {
                        j = gridSize;
                    }
                    break;
                    case 'O': {
                        if(row[j] != '0' & row[j] != 'O') {
                            j = gridSize;
                        } else if (j == (gridSize-1)) {
                            return false;
                        }
                    }
                    break;
                    case 'X': {
                        if(row[j] != '1' & row[j] != 'X') {
                            j = gridSize;
                        } else if (j == (gridSize-1)) {
                            return false;
                        }
                    }
                    break;
                }
            }
        }
        return true;
    }

    //Checks if column is unique
    public boolean isUsedHorizontal (char[] row) {
        for(int i = 0; i < gridSize; i++) {
            for(int j = 0; j < gridSize; j++){
                switch (mainGrid[j][i]) {
                    case ' ': {
                        j = gridSize;
                    }
                    break;
                    case 'O': {
                        if(row[j] != '0' & row[j] != 'O') {
                            j = gridSize;
                        } else if (j == (gridSize-1)) {
                            return false;
                        }
                    }
                    break;
                    case 'X': {
                        if(row[j] != '1' & row[j] != 'X') {
                            j = gridSize;
                        } else if (j == (gridSize-1)) {
                            return false;
                        }
                    }
                    break;
                }
            }
        }
        return true;
    }
}