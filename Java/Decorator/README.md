# What is Decorator design pattern
![Decorator example 1](https://gpcoder.com/wp-content/uploads/2018/11/design-patterns-decorator-diagram.png) 
### Bridge design pattern diagram <br><br>

# Problem
- Một hệ thống quản lý dự án, nơi nhân viên đang làm việc với các vai trò khác nhau, chẳng hạn như thành viên nhóm (team member), trưởng nhóm (team lead) và người quản lý (manager). 
- Một thành viên trong nhóm chịu trách nhiệm thực hiện các nhiệm vụ được giao và phối hợp với các thành viên khác để hoàn thành nhiệm vụ nhóm. 
- Mặt khác, một trưởng nhóm phải quản lý và cộng tác với các thành viên trong nhóm của mình và lập kế hoạch nhiệm vụ của họ. 
- Tương tự như vậy, một người quản lý có thêm một số trách nhiệm đối với một trưởng nhóm như quản lý yêu cầu dự án, tiến độ, phân công công việc.
<br><br>
  > ### Sau đây là các thành phần tham gia vào hệ thống và hành vi của chúng:
    > - Employee: thực hiện công việc (doTask), tham gia vào dự án (join), rời khỏi dự án (terminate).
    > - Team member: báo cáo task được giao (report task), cộng tác với các thành viên khác (coordinate with others).
    > - Team lead: lên kế hoạch (planning), hỗ trợ các thành viên phát triển (motivate), theo dõi chất lượng công việc và thời gian (monitor).
    > - Manager: tạo các yêu cầu dự án (create requirement), giao nhiệm vụ cho thành viên (assign task), quản lý tiến độ dự án (progress management).
- ## Hãy thực hiện việc nâng cấp chức vụ sau 6 sáng 1 lần: *NORMAL->MEMBER->LEADER->MANAGER*

- Với cách làm cũ ta thường làm: 
<br>

![old solution](https://gpcoder.com/wp-content/uploads/2018/11/design-patterns-decorator-example1.png)
# Solution

Sử dụng Decorator design pattern để giải quyết bài toán trên.
![Solution](https://gpcoder.com/wp-content/uploads/2018/11/design-patterns-decorator-example2.png)

# Details
[gpcoder decorator design pattern](https://gpcoder.com/4574-huong-dan-java-design-pattern-decorator/)<br>
 
# Folder structure
```
├── src (com.example.demo)
│   ├── commonInterface
│   │   └── EmployeeComponent(I)
│   ├── concrete
│   │   └── EmployeeConcreteComponent
│   ├── decorator
│   |   ├── EmployeeDecorator(A)
│   |   ├── TeamMember
│   |   ├── TeamLead
│   │   └── Member
│   ├── App
├── .gitignore
└── README.md