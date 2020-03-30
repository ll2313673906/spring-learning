##### @Configuration

@Configuration注解表示这是用于Spring的配置类

##### @Bean

如果xml中不添加id=""属性，那么默认添加进spring容器的类的id为类名首字母小写，如果@Bean没有添加name="",那么方法返回值的id为返回类型的首字母小写

##### @Controller

 将添加了该注解的类添加进spring容器，其实@Controller，@Service，@Repository,@Component效果相同

#####  @RestController

将添加了该注解的类添加进spring容器,并且该类的返回值是JSON格式，等同于添加了@RequestBody 和 @Controller两个注解

##### @Autowired

用来装配bean，都可以写在字段上，或者方法上，默认情况下必须要求依赖对象必须存在，如果要允许null值，可以设置它的required属性为false

#####  @RequestMapping

 提供请求映射信息，映射关系相对于 WEB 应用的根目录
 
 