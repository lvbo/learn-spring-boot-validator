## 学习Spring Boot集成Validation校验RESTful接口的输入参数

## 常用注释说明如下：

注解 | 应用目标 |	运行时检查
--- | --- | ---
@Length(min=, max=)	| 属性（String）| 检查字符串长度是否符合范围
@Max(value=) | 属性（以 numeric 或者 string 类型来表示一个数字）	| 检查值是否小于或等于最大值
@Min(value=) | 属性（以 numeric 或者 string 类型来表示一个数字） | 检查值是否大于或等于最小值
@NotNull | 属性 检查值是否not null	| 列不为空
@NotBlank | 属性 检查字符串是否not null，并且至少包含一个非空白字符	| 列不为空
@NotEmpty | 属性 检查值是否not null或非空(CharSequence,Collection,Map,Array) | 列不为空
@Pattern(regex="regexp", flag=)	| 属性（string） | 检查属性是否与给定匹配标志的正则表达式相匹配（见 java.util.regex.Pattern ）
@Range(min=, max=) | 属性（以 numeric 或者 string 类型来表示一个数字） | 检查值是否在最小和最大值之间（包括临界值）
@Size(min=, max=) |	属性（array,collection,map）| 检查元素大小是否在最小和最大值之间（包括临界值）
@Email | 属性（String） | 检查字符串是否符合有效的 email 地址规范

## 自定义注释

见代码 io.github.lvbo.lsb.validator.validation 包路径下  