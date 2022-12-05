# What is Bridge design pattern
![Bridge example 1](https://refactoring.guru/images/patterns/diagrams/bridge/structure-en.png?id=827afa4b40008dc29d26fe0f4d41b9cc) 
![Bridge example 2](https://refactoring.guru/images/patterns/content/bridge/bridge-3-en.png?id=15b8262114938f7bef6602af33f0a62e) 
### Bridge design pattern diagram <br><br>

# Problem
![Problem](https://refactoring.guru/images/patterns/diagrams/bridge/problem-en.png?id=81f8ed6e6f5d673e15203b22a7a3c502)
# Solution

Sử dụng Bridge design pattern để giải quyết bài toán trên.
![Solution](https://refactoring.guru/images/patterns/diagrams/bridge/solution-en.png?id=b72caae18c400d6088072f2f3adda7cd)

# Details
[gpcoder bridge design pattern](https://gpcoder.com/4520-huong-dan-java-design-pattern-bridge/)<br>
[refactoring guru bridge design pattern](https://refactoring.guru/design-patterns/bridge)
 
# Folder structure
```
├── src (com.example.demo)
│   ├── shape
│   |   ├── Shape(A)
│   |   ├── CircleShape
│   |   ├── SquareShape
│   │   └── ...
│   ├── color
│   |   ├── Color(A)
│   |   ├── BlurColor
│   |   ├── RedColor
│   │   └── ...
│   ├── App
├── .gitignore
└── README.md