# Project Outline

Concept: - So the idea is about zombies in a videogame trying to find the shortest path on the level terrain to chase the player.
- So the idea is playing on a hard level in a game where the player runs from zombies where the zombies are smart and constantly trying to calculate the shortest path to the player instead of just trying to move directly towards the player's position on a straight line.

- So the level terrain is a graph where each vertex ia a grid space in the terrain and each edge connects grid spaces that are adjacent.
- The position of the Player is a vertex and the position of each zombie is a vertex.

- To make it interesting, the graph is a weighted graph and the weights are the speed that the zombie travels at on the path. In the level, it is raining, windy and muddy. So the speed of the zombie is fastest indoors, medium outdoors where it's paved, and slowest outdoors in the mud.

Plan
- Functionality: 
- Input/Output examples: 
- necessary classes: 
  - required methods
- stretch goals for extra things to add
- relevant diagrams


Functionality
  - Given a weighted graph representing a terrain map in a game and two vertices player and zombie, calculate the shortest path from zombie to player.
  - (later, we can try optimizing the program to create minimal extra space or find how often to call our function to optimize performance)

Input/Output examples
  - Input: a weighted graph where each vertex represents a grid space on the terrain map of the game and a vertex representing the player positon and a vertex representing the zombie position. 
  - For the weighted graph, the edges connect grid spaces that are adjacent on the terrain map, and the weights represent the amount of drag the zombie faces when trying to move along the path.
  - The weights of the edges can have four values: wall_drag, indoor_drag, outdoor_drag, outdoor_mud_drag.