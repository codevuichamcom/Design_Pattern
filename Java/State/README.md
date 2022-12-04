# What is State design pattern
![State example 1](https://gpcoder.com/wp-content/uploads/2019/01/design-patterns-state-diagram.png) 
### State design pattern diagram <br><br>

# Problem
- Tạo workflow nhu jira
- Có thể thay đổi hoặc thêm workflow 1 cách linh hoạt
# Solution

Sử dụng State design pattern để giải quyết bài toán trên.

# Details
[gpcoder state design pattern](https://gpcoder.com/4785-huong-dan-java-design-pattern-state/)
 
# Folder structure
```
├── src (com.example.demo)
│   ├── context
│   │   └── WorkFlowContext
│   ├── state
│   |   ├── WorkFlow(I)
│   |   ├── TodoWorkFlow
│   |   ├── InprogressWorkFlow
│   |   ├── RejectWorkFlow
│   |   ├── DoneWorkFlow
│   │   └── ...
│   ├── App
├── .gitignore
└── README.md