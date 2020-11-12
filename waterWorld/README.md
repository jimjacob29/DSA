**Learning of DSA using Java**
My Codes
Year is 3030, water is a scare resource.
Civilizations live around glaciers in clusters, with a federal body (identified as F) in center melting glaciers and controlling the water distribution.
Each cluster has need for water for a day and a water storage capacity.
Cluster are connected to each other with a pipe identified by _.
Linked clusters are connected with overflow pipes.
Every time water starts flowing through pipe, the clusters drain their tanks in an instant, as they can use the water flowing to fill the tanks, and federal body sends water till the capacity is full.
Federal body releases water at start of day, cluster uses water at end of day.
In a pipe link like F-C1-C2-C3-C4, when federal water body targets C3, only C3 and nodes before it (here C1,C2,C3) can fill the tank, C4 can fill it only when it’s targeted.
Pipes are flow controlled and water flows in forward direction only.

Calculate the minimum water needed to help the civilizations survive for n days.

Input is multiline. First line is the number of days to survive. Second line the number of clusters followed by their definitions. Next is the number of links in the system, followed by the link definition.

Read the test cases to understand the scenarios better.