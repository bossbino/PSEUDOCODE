/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pseudocode;

FUNCTION main() {
    PRINT "Welcome to Find The Treasure Game!";
    PRINT "You wake up in a mysterious forest. Your goal is to find the treasure.";

    CALL startAdventure(scanner);

}

FUNCTION startAdventure(scanner) {
    PRINT "You find yourself in a dense forest with two paths ahead.";
    PRINT "Do you want to go 'left' or 'right'?";

    INPUT choice1;

    IF (choice1 == "left") {
        CALL pathLeft(scanner); 
    } ELSE IF (choice1 == "right") {
        CALL pathRight(scanner); 
    } ELSE {
        PRINT "Invalid choice. Please choose 'left' or 'right'.";
        CALL startAdventure(scanner); 
    }
}

FUNCTION pathLeft(scanner) {
    PRINT "You walk down the left path and come across a river.";
    PRINT "You see a bridge to cross the river. Do you want to 'cross' or 'go back'?";

    INPUT choice2;

    IF (choice2 == "cross") {
        CALL crossBridge(scanner); 
    } ELSE IF (choice2 == "go back") {
        PRINT "You decide to go back. You're back at the starting point.";
        CALL startAdventure(scanner); 
    } ELSE {
        PRINT "Invalid choice. Please choose 'cross' or 'go back'.";
        CALL pathLeft(scanner); 
    }
}

FUNCTION crossBridge(scanner) {
    PRINT "You cross the bridge and find a treasure chest!";
    PRINT "Do you want to 'open' the chest or 'leave' it alone?";

    INPUT choice3;

    IF (choice3 == "open") {
        PRINT "It's a trap!! (*CHEST EXPLODED) You Died, GAME OVER!";
    } ELSE IF (choice3 == "leave") {
        PRINT "You leave the chest and continue walking. Eventually, you get lost.";
        CALL leavingChest(scanner); 
    } ELSE {
        PRINT "Invalid choice. Please choose 'open' or 'leave'.";
        CALL crossBridge(scanner); 
    }
}

FUNCTION leavingChest(scanner) {
    PRINT "You've been in the deep forest and you've found a cave";
    PRINT "Do you want to 'go inside' or 'stay'?";

    INPUT choice4;

    IF (choice4 == "go inside") {
        PRINT "Oh no!! there's no way out and a BIG BEAR is approaching towards you,";
        PRINT "You should fight the BEAR";
        CALL fightBear(scanner);
    } ELSE IF (choice4 == "stay") {
        PRINT "You've stayed outside and died from starvation, GAME OVER!";
     
    } ELSE {
        PRINT "Invalid choice. Please choose 'go inside' or 'stay'.";
        CALL leavingChest(scanner); 
    }
}

FUNCTION pathRight(scanner) {
    PRINT "You walk down the right path and encounter a wild bear!";
    PRINT "Do you want to 'fight' the bear or 'run' away?";

    INPUT choice2;

    IF (choice2 == "fight") {
        CALL fightBear(scanner); 
    } ELSE IF (choice2 == "run") {
        PRINT "You run away and get lost in the forest. Game over.";
    } ELSE {
        PRINT "Invalid choice. Please choose 'fight' or 'run'.";
        CALL pathRight(scanner); 
    }
}

FUNCTION fightBear(scanner) {
    PRINT "You decide to fight the bear.";
    PRINT "Do you use a 'sword' or 'rock' to fight?";

    INPUT choice3;

    IF (choice3 == "sword") {
        PRINT "You successfully fight the bear with your sword and win!";
        PRINT "You continue down the path and find the treasure chest.";
        PRINT "Congratulations, you found the treasure! You win!";
    } ELSE IF (choice3 == "rock") {
        PRINT "You throw a rock at the bear, but it is too strong.";
        PRINT "The bear attacks you, and you lose. Game over.";
    } ELSE {
        PRINT "Invalid choice. Please choose 'sword' or 'rock'.";
        CALL fightBear(scanner);
    }
}
