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
  - Given a weighted undirected graph representing a terrain map in a game and two vertices player and zombie, calculate the shortest path from zombie to player.
  - (later, we can try optimizing the program to create minimal extra space or find how often to call our function to optimize performance)

Input/Output examples
  - Input: a weighted graph where each vertex represents a grid space on the terrain map of the game and a vertex representing the player positon and a vertex representing the zombie position. 
  - For the weighted graph, the edges connect grid spaces that are adjacent on the terrain map, and the weights represent the amount of drag the zombie faces when trying to move along the path. For simplicity, the zombie can only move forward, backward, left and right from a given tile and not diagonally. So edges only connect adjacent vertices that are above, below, left and right of each other and not diagonally. 
  - The weights of the edges can have four values: wall_drag, indoor_drag, outdoor_drag, outdoor_mud_drag, based on the drag the zombie experiences when trying to travel on that tile. 
    - wall_drag: infinity- Walls the zombie cannot move through will have wall_drag of infinity so that the shortest path will avoid them
    - indoor_drag: 1-  The zombie will move the fastest indoors and the drag will be the lowest.
    - outdoor_drag: 2- The zombie will slower outdoors due to wind and the drag will be higher than the drag indoors
    - outdoor_mud_drag: 4- The zombie will move the slowest in the mud so the drag will be the highest.
  
  - Example input: graph = {{1: {2:2}, {4:4}},
                            {2: {1:2}, {3:1}, {5:1}},
                            {3: {2:1}, {6:1}},
                            {4: {1:4}, {5:2}, {7:4}},
                            {5: {2:1}, {4:2}, {6:infinity}, {8:1}},
                            {6: {3:1}, {5:infinity}, {9:1}},
                            {7: {4:4}, {8:2}, {10:4}},
                            {8: 5, 7, 9, 11},
                            {10: {7:4}, {11:2}},
                            {11: {10:2}, {8:2}, {12:2}},
                            {12: {11:2}, {9:2}}},
                  zombie = 1, player = 12
    Output: {1, 2, 3, 6, 9, 12}

Necessary classes:
  - Main class- test the program, 
  - Vertex class- vertex of the graph
  - 



  Main class
    - ``main()``
    - ``findShortestPath()``
  Vertex
    - ``Vertex(val, List<LIst> adjList)``
    - ``List<List> adjList // Two dimensional list with {adjacent vertex, weight} pairs``
    - ``int val``
                      