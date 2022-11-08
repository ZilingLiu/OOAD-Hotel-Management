# OOAD-Hotel-Management

## 进度
1. 后端代码存放在com.hotel下，已经实现了数据库的连接，能够在测试平台上完成与后端的交互。

## 代码解释
1. 后端代码config下是分页查询的配置类
2. controller 下是表现层，用@RequestMapping与前端交互。util下的R类是后端与前端的数据格式约定，目前含有两个变量的json格式，flag值为True或False代表后端是否正确做出响应，data值为后端向前端提供的数据，当前端无需返回数据时，data为null。比如登录成功则{
    "flag": true,
    "data": null
}。

查询酒店成功则返回{
    "flag": true,
    "data": [{
        "id": 1,
        "hotelName": "如家(佛山)",
        "roomNumber": 301,
        "roomType": "标准双人间",
        "price": 250,
        "introduction": "很好的房间"
    }]
}
3. dao下是数据层， 内部domain为数据库各表对应的实体类，接口已经实现了每个表的增删改查操作函数（ctrl f12查看）。
4. service是数据层的业务层接口，接口通过IService也直接生成了对于每个表的增删改查方法，可以尽量避免在业务层直接调用dao中的函数，而只需调用service中对于每个表增删改查的函数。
5. appl层是功能实现代码应该放置的地方。在此处可以调用service中的函数做一些实际的功能，比如已经实现的userCheck中包含登录和注册功能。
6. 前端的页面应该是放在static文件下。

