# OOAD-Hotel-Management

## 进度
1. 后端代码存放在com.hotel下，已经实现了数据库的连接，能够在测试平台上完成与后端的交互。

## 代码解释
1. 后端代码config下是分页查询的配置类
2. controller 下是表现层，用@RequestMapping与前端交互。util下的R类是后端与前端的数据格式约定，目前含有两个变量的json格式，flag值为True或False代表后端是否做出响应，data值为
后端向前端提供的数据。
3. dao下是数据层， 内部domain为数据库各表对应的实体类，接口已经实现了每个表的增删改查操作函数（ctrl f12查看）。
4. service下是主要业务层，实现功能的代码大多写在此处，接口通过IService也直接生成了对于每个表的增删改查方法，可以直接调用。
5. 前端的页面应该是放在static文件下。

