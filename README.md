## 安装前请卸载已安装的官方插件避免冲突。

# 前言

因为阿里官方长时间未修复相关bug，所以只能fork一份，修复在使用过程中遇到的bug。

- fork节点为[6c59c8c3](https://github.com/alibaba/p3c/commit/6c59c8c36ecd8722c712d5685b8c3822c1c8b030)

插件已经上传到了jetbrains的插件市场  
欢迎安装[https://plugins.jetbrains.com/plugin/22381-alibaba-java-coding-guidelines-fix-some-bug-](https://plugins.jetbrains.com/plugin/22381-alibaba-java-coding-guidelines-fix-some-bug-)

# 源码地址

- [Github](https://github.com/godfather1103/p3c)
- [Gitee](https://gitee.com/godfather1103/p3c)

# 插件版本号说明

> 迭代版本 + idea版本 + P3C_PMD版本
 
# namelist.properties说明

```properties
# 常量字段名日志对象字段名
ConstantFieldShouldBeUpperCaseRule_LOG_VARIABLE_TYPE_SET=["Log","Logger"]
# 常量字段名的白名单
ConstantFieldShouldBeUpperCaseRule_WHITE_LIST=["serialVersionUID"]
# 驼峰需要忽略的专有名词
LowerCamelCaseVariableNamingRule_WHITE_LIST=["DAOImpl"]
# pojo的后缀
PojoMustOverrideToStringRule_POJO_SUFFIX_SET=["DO","DTO","VO","BO"]
# 忽略的魔法值列表
UndefineMagicConstantRule_LITERAL_WHITE_LIST=["0","1","\\\"\\\"","0.0","1.0","-1","0L","1L"]
# 包装类映射
MethodReturnWrapperTypeRule_PRIMITIVE_TYPE_TO_WAPPER_TYPE={"int":"Integer","boolean":"Boolean","float":"Float","double":"Double","byte":"Byte","short":"Short","long":"Long","char":"Character"}
# 需要初始化大小的对象
CollectionInitShouldAssignCapacityRule_COLLECTION_TYPE=["HashMap","ConcurrentHashMap"]
# 类名中需要排除的专有名词
ClassNamingShouldBeCamelRule_CLASS_NAMING_WHITE_LIST=["Hbase","HBase","ID"]

```
