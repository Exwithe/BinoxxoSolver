package com.company.binoxxosolver;

public class Grid {
    //Variables

        //Errors
    private int errors = 0;

        //Grid to solve
    private char[][] mainGrid = {
    };


    //Constructors
    public Grid(char[][] userGridinput) {
        this.mainGrid = userGridinput;
    }
    //getter

    public char[][] getMainGrid() {
        return mainGrid;
    }
    public char getIndexUtserGrid(int i, int j){
        return mainGrid[i][j];
    }

    public int getErrors() {
        return errors;
    }



    //methods
    public void printGrid(char[][] grid) {
        for (int i = 0; i <grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j]);

            }
            System.out.println();
        }
        System.out.println();

    }

    //all solving method
    public char[][] solveGrid() {
        //methode 1 X_X O_O checker vertical
        for(int i = 0;i<10;i++) {
            for(int j =1;j<9;j++ ) {
                if(mainGrid[i][j]==' ' & mainGrid[i][j+1] == 'X' & mainGrid[i][j-1] == 'X') {
                    mainGrid[i][j] = 'O';
                    if (!isTrue() | !isUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                }
                if(mainGrid[i][j]==' ' & mainGrid[i][j+1] == 'O' & mainGrid[i][j-1] == 'O') {
                    mainGrid[i][j] = 'X';
                    if (!isTrue() | !isUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                }
            }
        }
        //method 1 X_X O_O checker horizontal
        for(int i = 0;i<10;i++) {
            for(int j =1;j<9;j++ ) {
                if(mainGrid[j][i]==' ' & mainGrid[j+1][i] == 'X' & mainGrid[j-1][i] == 'X') {
                    mainGrid[j][i] = 'O';
                    if (!isTrue() | !isUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                }
                if(mainGrid[j][i]==' ' & mainGrid[j+1][i] == 'O' & mainGrid[j-1][i] == 'O') {
                    mainGrid[j][i] = 'X';
                    if (!isTrue() | !isUnique()) {
                        errors = 2;
                    }
                    return mainGrid;
                }
            }
        }
        //methode 1 XX OO checker horizontal
        for(int i = 0;i<10;i++) {
            for (int j = 0; j < 9; j++) {
                if(mainGrid[i][j] == 'X' & mainGrid[i][j+1] == 'X') {
                    switch (j) {
                        case 0: {
                            if(mainGrid[i][j+2] == ' ') {
                                mainGrid[i][j+2] = 'O';
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                        case 1: case 2: case 3: case 4: case 5: case 6: case 7: {
                            if (mainGrid[i][j - 1] == ' ') {
                                mainGrid[i][j - 1] = 'O';
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                            if (mainGrid[i][j + 2] == ' ') {
                                mainGrid[i][j + 2] = 'O';
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }break;
                        case 8: {
                            if (mainGrid[i][j - 1] == ' ') {
                                mainGrid[i][j - 1] = 'O';
                                if (!isTrue() | !isUnique()) {
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
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                        case 1: case 2: case 3: case 4: case 5: case 6: case 7: {
                            if (mainGrid[i][j - 1] == ' ') {
                                mainGrid[i][j - 1] = 'X';
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                            if (mainGrid[i][j + 2] == ' ') {
                                mainGrid[i][j + 2] = 'X';
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }break;
                        case 8: {
                            if (mainGrid[i][j - 1] == ' ') {
                                mainGrid[i][j - 1] = 'X';
                                if (!isTrue() | !isUnique()) {
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
        for(int i = 0;i<10;i++) {
            for (int j = 0; j < 9; j++) {
                if(mainGrid[j][i] == 'X' & mainGrid[j+1][i] == 'X') {
                    switch (j) {
                        case 0: {
                            if(mainGrid[j+2][i] == ' ') {
                                mainGrid[j+2][i] = 'O';
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                        case 1: case 2: case 3: case 4: case 5: case 6: case 7: {
                            if (mainGrid[j - 1][i] == ' ') {
                                mainGrid[j - 1][i] = 'O';
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                            if (mainGrid[j + 2][i] == ' ') {
                                mainGrid[j + 2][i] = 'O';
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }break;
                        case 8: {
                            if (mainGrid[j - 1][i] == ' ') {
                                mainGrid[j - 1][i] = 'O';
                                if (!isTrue() | !isUnique()) {
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
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }
                        break;
                        case 1: case 2: case 3: case 4: case 5: case 6: case 7: {
                            if (mainGrid[j - 1][i] == ' ') {
                                mainGrid[j - 1][i] = 'X';
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                            if (mainGrid[j + 2][i] == ' ') {
                                mainGrid[j + 2][i] = 'X';
                                if (!isTrue() | !isUnique()) {
                                    errors = 2;
                                }
                                return mainGrid;
                            }
                        }break;
                        case 8: {
                            if (mainGrid[j - 1][i] == ' ') {
                                mainGrid[j - 1][i] = 'X';
                                if (!isTrue() | !isUnique()) {
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
        for (int i = 0; i < 10; i++) {
            char[] solutoionGrid = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
            char[] checkGrid = new char[10];
            int zero = 0;
            for (int j = 0; j < 10; j++) {
                checkGrid[j] = mainGrid[i][j];
                if (checkGrid[j] == ' ') {
                    zero++;
                    checkGrid[j] = '0';
                }
            }
            //checker
            if (isRowColumnTrue(checkGrid)) {
                for (int l = 0; l < 10; l++) {
                    if (solutoionGrid[l] == ' ') {
                        solutoionGrid[l] = checkGrid[l];
                    } else if (checkGrid[l] != solutoionGrid[l]) {
                        solutoionGrid[l] = 'Z';
                    }
                }
            }
            for(int j = 0; j < (Math.pow(2,zero)-1);j++) {
                int k = 0;
                while (checkGrid[k] != '0') {
                    if (checkGrid[k] == '1') {
                        checkGrid[k] = '0';
                    }
                    k++;
                }
                checkGrid[k] = '1';
                k = 0;
                //checker
                prtRow(checkGrid);
                System.out.println(isUsedHorizontal(checkGrid));
                if (isRowColumnTrue(checkGrid) & isUsedVertical(checkGrid)) {
                    for (int l = 0; l < 10; l++) {
                        if (solutoionGrid[l] == ' ') {
                            solutoionGrid[l] = checkGrid[l];
                        } else if (checkGrid[l] != solutoionGrid[l]) {
                            solutoionGrid[l] = 'Z';
                        }
                    }
                }
            }

            for (int l = 0; l < 10; l++) {
                if (solutoionGrid[l] == '0') {
                    mainGrid[i][l] = 'O';
                    return mainGrid;
                } else if (solutoionGrid[l] == '1') {
                    mainGrid[i][l] = 'X';
                    return mainGrid;
                }
            }

        }

        // Check if any solution is Possible horizonal
        for (int i = 0; i < 10; i++) {
            char[] solutoionGrid = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
            char[] checkGrid = new char[10];
            int zero = 0;
            for (int j = 0; j < 10; j++) {
                checkGrid[j] = mainGrid[j][i];
                if (checkGrid[j] == ' ') {
                    zero++;
                    checkGrid[j] = '0';
                }
            }

            if (isRowColumnTrue(checkGrid)) {
                for (int l = 0; l < 10; l++) {
                    if (solutoionGrid[l] == ' ') {
                        solutoionGrid[l] = checkGrid[l];
                    } else if (checkGrid[l] != solutoionGrid[l]) {
                        solutoionGrid[l] = 'Z';
                    }
                }
            }
            for(int j = 0; j < (Math.pow(2,zero)-1);j++) {
                int k = 0;
                while (checkGrid[k] != '0') {
                    if (checkGrid[k] == '1') {
                        checkGrid[k] = '0';
                    }
                    k++;
                }
                checkGrid[k] = '1';
                k = 0;
                //checker
                if (isRowColumnTrue(checkGrid) & isUsedHorizontal(checkGrid)) {
                    for (int l = 0; l < 10; l++) {
                        if (solutoionGrid[l] == ' ') {
                            solutoionGrid[l] = checkGrid[l];
                        } else if (checkGrid[l] != solutoionGrid[l]) {
                            solutoionGrid[l] = 'Z';
                        }
                    }
                    //prtRow(solutoionGrid);
                }
            }

            for (int l = 0; l < 10; l++) {
                if (solutoionGrid[l] == '0') {
                    mainGrid[l][i] = 'O';
                    return mainGrid;
                } else if (solutoionGrid[l] == '1') {
                    mainGrid[l][i] = 'X';
                    return mainGrid;
                }
            }

        }
        // multible Solution error
        errors = 1;
        return mainGrid;
    }

    //checks if grid is valid
    public boolean isTrue() {
        boolean isTru = true;
        for (int i = 0; i < 10; i++) {
            int fuenf = 0;
            int eins = 0;
            int zero = 0;
            for (int j = 0; j < 10; j++) {
                switch (mainGrid[i][j]) {
                    case 'X':
                        fuenf++;
                        eins = 0;
                        zero++;
                        break;
                    case 'O':
                        fuenf--;
                        zero = 0;
                        eins++;
                        break;
                }
                if (zero >= 3 | eins >= 3) {
                    return true;
                }
            }
            eins = 0;
            zero = 0;
            if (fuenf != 0) {
                return true;
            }
        }
        return false;
    }

    //ckecks if all rows/colums
    public boolean isUnique() {
        boolean isUnique = true;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < 10; k++) {
                    if (mainGrid[i][k] == mainGrid[j][k] & mainGrid[j][k] != ' ' & mainGrid[i][k] != ' ') {
                        if (k == 9) {
                            return false;
                        }
                    } else {
                        k = 10;
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < 10; k++) {
                    if (mainGrid[k][i] == mainGrid[k][j] & mainGrid[j][k] != ' ' & mainGrid[i][k] != ' ') {
                        if (k == 9) {
                            return false;
                        }
                    } else {
                        k = 10;
                    }
                }
            }
        }
        return true;
    }
    public boolean isRowColumnTrue (char[] x) {
        boolean isTru;
        int fuenf = 0;
        int eins = 0;
        int zero = 0;
        for (int j = 0; j < 10; j++) {
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
        eins = 0;
        zero = 0;
        if (fuenf != 0) {
            return false;
        }
        return true;

    }

    static void prtRow(char[] row){
        for (int i = 0; i < 10 ; i++) {
            System.out.print(row[i]);
        }
        System.out.println();
    }

    public boolean isUsedVertical (char[] row) {
        for(int i = 0;i < 10;i++) {
            for(int j =0;j<10;j++){
                switch (mainGrid[i][j]) {
                    case ' ': {
                        j = 10;
                    }
                    break;
                    case 'O': {
                        if(row[j] != '0' & row[j] != 'O') {
                            j = 10;
                        } else if (j == 9) {
                            return false;
                        }
                    }
                    break;
                    case 'X': {
                        if(row[j] != '1' & row[j] != 'X') {
                            j = 10;
                        } else if (j == 9) {
                            return false;
                        }
                    }
                    break;
                }
            }
        }
        return true;
    }
    public boolean isUsedHorizontal (char[] row) {
        prtRow(row);
        for(int i = 0;i < 10;i++) {
            for(int j =0;j<10;j++){
                switch (mainGrid[j][i]) {
                    case ' ': {
                        j = 10;
                    }
                    break;
                    case 'O': {
                        if(row[j] != '0' & row[j] != 'O') {
                            j = 10;
                        } else if (j == 9) {
                            return false;
                        }
                    }
                    break;
                    case 'X': {
                        if(row[j] != '1' & row[j] != 'X') {
                            j = 10;
                        } else if (j == 9) {
                            return false;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(true);
        return true;
    }

}