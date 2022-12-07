
# Problem

## Ví dụ Chain of Responsibility Pattern với ứng dụng LeaveRequest
- Một ví dụ khác là ứng dụng phê duyệt xin nghỉ phép. 
- Nếu xin nghỉ <=3 ngày thì Supervisor có thể phê duyệt (approve). 
- Nếu xin nghỉ <=5 ngày thì DeliveryManager có thể approve. 
- Nếu xin nghỉ >5 ngày thì phải được approve bởi Director. 
- Quy trình này có thể linh động tùy theo quy mô phát triển của công ty.
# Solution

![solution](https://gpcoder.com/wp-content/uploads/2018/12/design-patterns-chain-of-responsibility-example-leave-request.png)

# Details
[gpcoder chain of responsibility design pattern](https://gpcoder.com/4665-huong-dan-java-design-pattern-chain-of-responsibility/)<br>
 
# Folder structure
```
├── src (com.example.demo)
│   ├── client
│   │   └── App
│   ├── handler
│   |   ├── Approver(A)
│   |   ├── Supervisor
│   |   ├── DeliveryManager
│   │   └── Director
│   ├── utils
│   │   └── LeaveRequestWorkFlow
├── .gitignore
└── README.md