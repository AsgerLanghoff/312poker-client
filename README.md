                                               Introduction

The Server side of this Poker Texas hold'em game, consists of various classes that make it function with networking and multithreading on a basic level.

To start a game a server is required to be running, when a server is running it is possible for clients to join the lobby and from there join the game with the command 'ready'. When ready has been entered by all clients, a poker session will start.

The client side is developed by Mathias Adrian Wagner Kristiansen (Mathiasawk) and Rastislav Cech (Rast03)
Find the adjoining client here: https://github.com/MikkelAAU/312poker-client

                                         Step-by-Step guide for cmd-setup

If step 1-5 has been done in client already then you can skip those

Step 1: Download the repository to your computer desktop as a zip and unzip it to a folder by the same name.

Step 2: Download and install the java development kit from this link: https://goo.gl/KppQHL

Step 3: After install find the javac file on your computer possibly here: C:\Program Files\Java\jdk1.8.0_162\bin - it can also be in the program files (x86) and copy the file location, just like the above here ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑.

Step 4: Now search for 'edit the system environment variables' in the search bar or on your system. Press the button named 'Environment Variables...'

Step 5: Double click 'Path', press the button 'New' and paste the abovementioned link location in the open field. Press 'okay' to close all windows.

Step 6: Open CMD - Right click the top white bar and press 'properties' - go to fonts and choose 'Lucida Console' and click okay.

Step 7: If you wish to play on you own computer localhost will work as IP later when configuring clients, but if you wish to play on multiple computers then you will need to obtain the correct ip from cmd before the start of the game. This is done by entering 'ipconfig' in cmd and copying the IPV4 address like this example: 192.168.??.?? - have this ready for when creating clients for the server.

Step 8: locate the java files by using the 'cd' command until your in the right directory like this: C:\Users\Bloon>cd desktop/312poker-server-master/src

Step 9: Create the javac version of the server by entering in cmd: javac -encoding UTF8 Main_Package/Server.java

Step 10: Now that the javac version is created you can open the server in cmd by entering: java Main_Package/Server Remember capital S in server.

Step 11: Type in a port number you want to open up a server on, do not select one below 1024 as they are reserved ports.

                                                 Gameplay

In hold'em, players receive two down cards as their personal hand (holecards), after which there is a round of betting. Three table cards are turned simultaneously (called the flop) and another round of betting occurs. The next two board cards are turned one at a time, with a round of betting after each card. The board cards are community cards, and a player can use any five-card combination from among the board and personal cards. A player can even use all of the board cards and no personal cards to form a hand ("play the board").

Rounds of Betting: Opening deal - Each player is dealt two cards face down, which are known as hole cards or pocket cards.

First round of betting: Starting with a random player, each player can call the current highest bet, raise, or fold.

The flop: The dealer burns a card, and then deals three community cards face up. The first three cards are referred to as the flop, while all of the community cards are collectively called the board.

Second round of betting: Starting with the player to the left of the dealer button, each player can check or bet. Once a bet has been made, each player can raise, call, or fold.

The turn: The dealer burns another card, and then adds a fourth card face-up to the community cards. This fourth card is known as the turn card, or fourth street.

Third round of betting: It follows the same format as the second round.

The river: The dealer burns another card, and then adds a fifth and final card to the community cards. This fifth card is known as the river card, or fifth street.

Final round of betting: It follows the same format as the second and third rounds.

The showdown: Using the best five-card combination of their hole cards and the community cards, the remaining players have their hands compared. The highest five-card hand wins the pot.
