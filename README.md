# Java-Pokemon-Battler

*I have taken the Javascript Pokemon Battler given to us at Northcoders and used it to create the same thing in Java as below*

## Pokemon Battle Game

## Pokemon

- Each pokemon should have a name, hit points (health), attack damage, the sound that it makes, and one move. (e.g. 'bite')  
- The default 'type' for each Pokemon will have no strengths or weaknesses. 
- You should be able to create grass pokemon, water pokemon and fire pokemon. 
- Fire pokemon are strong against grass, and weak against water. Grass pokemon are strong against water, and weak against fire. Water pokemon are strong against fire and weak against grass. 
- Every pokemon should have a talk method available, which returns its sound.
- Every pokemon should have a useYourMoves method available, which returns its favourite move.

## Trainer
- Pokemon trainers will have a name, and a way of storing pokemon. 
- Each pokemon trainer will also have a catch method available, so they can store more pokemon. 

## Battle
- Finally, you will need a way to battle the pokemon. 
- The battle should take two trainers and the names of the pokemon they wish to battle. 
- The battle should have a fight method available. This should take the pokemon whose turn it is, attack the defending pokemon (deducting attacker's attack damage from the defender's hit points), and end their turn. 
- The fight method should take each pokemon's strengths and weaknesses into account. If a defender is strong against the attacking type, the attacking type's damage should be multiplied by 0.75. If a defender is weak against the attacking type, the attacking type's damage should be multiplied by 1.25. 
- Each attack should be followed by an attack message. The message will vary depending on the defender's weakness/strength. 
- If the defending pokemon faints (depletes all hit points), the attacker wins. 

## Making the game
Once you have all the necessary parts fully tested, make the game! 

*This can be done in Java with scanners*

Using the [inquirer library] (https://www.npmjs.com/package/inquirer), build a command line application to play your pokemon battle game. The game should be played using inputs and selections. 

### Extra Requirements
- Implement a critical hit, that randomly awards pokemon triple damage.
- A trainer should only be able to hold 6 pokeballs. Limit the number of pokemon that a trainer can store. 
- In the original pokemon games, the victor was only declared once all of a trainer's pokeballs contained unconscious pokemon. Improve your battle function so take this into account. 
- Trainers should be able to change pokemon mid battle to adjust to changing circumstances. This should end the trainer's turn. 
- Pokemon should have a selection of moves, stored in an array. Each move should modify the pokemon's attack damage, and should be available a finite amount of times - determined by its PP (power points). When a move is used, it loses a power point. When there are no more power points for that move, it cannot be used. When none of that pokemon's moves can be used, it 'struggles' by default. This damages the attacker for its base attack value, rather than the defender. 
