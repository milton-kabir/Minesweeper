# Minesweeper
The game starts with an unexplored minefield that has a user-defined number of mines.

The player can:

    Mark unexplored cells as cells that potentially have a mine, and also remove those marks. Any empty cell can be marked, 
    not just the cells that contain a mine. The mark is removed by marking the previously marked cell.
    
    Explore a cell if they think it does not contain a mine.

There are three possibilities after exploring a cell:

    If the cell is empty and has no mines around, all the cells around it, including the marked ones, can be explored, and 
    it should be done automatically. Also, if next to the explored cell there is another empty one with no mines around, 
    all the cells around it should be explored as well, and so on, until no more can be explored automatically.

    If a cell is empty and has mines around it, only that cell is explored, revealing a number of mines around it.

    If the explored cell contains a mine, the game ends and the player loses.

There are two possible ways to win:

    Marking all the cells that have mines correctly.

    Opening all the safe cells so that only those with unexplored mines are left.
