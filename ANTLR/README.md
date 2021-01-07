# ANTLR_projects
All my projects made with ANTLR (ANother Tool for Language Recognition).
## Requirements
1. You need to install ANTLR in your device and add it to your path variables, just in case you want to modify ANTLR grammars.
2. You need GraphViz to be capable of generate graphs, also you will need to add it to your path variables
## Functionality
HTML grammar will parse an HTML file to add it custom styles that are predefined.
JSONLD graph generator is more complex. It is able to read CSV files with all the data, with a similar syntax to the sample ones,
also it is able to read JSON and TXT files. For doing that you need to indicate it with -CSV=file.csv, -JSON=file.json or -TXT=file.txt.
Moreover you can set custom parameters to get your custom graph, you can add all of these:

* -len_[relationship|class|property|inheritance|indirect_use|…]=<number>
* -fontcolor_[edge|node]_[relationship|class|property|inheritance|indirect_use|…]=<string>
* -fontname_[edge|node]_[relationship|class|property|inheritance|indirect_use|…]=<string>
* -fontsize_[edge|node]_[relationship|class|property|inheritance|indirect_use|…]=<number>
* -arrowsize_[edge|node]_[relationship|class|property|inheritance|indirect_use|…]=<number>
* -arrowcolor_[edge|node]_[relationship|class|property|inheritance|indirect_use|…]=<string>
* -penwidth_[edge|node]_[relationship|class|property|inheritance|indirect_use|…]=<number>
* -fillcolor_[edge|node]_[relationship|class|property|inheritance|indirect_use|…]=<string>
* -style_[edge|node]_[relationship|class|property|inheritance|indirect_use|…]=<string>
* -shape_[edge|node]_[relationship|class|property|inheritance|indirect_use|…]=<string>

You have all these properties to customize, you can choose between edge or node and the type of node or relationship it has.
