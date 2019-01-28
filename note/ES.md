https://es.xiaoleilu.com/030_Data/40_Version_control.html


3.8 - 3.12
https://es.xiaoleilu.com/030_Data/50_Mget.html

一种常见的结构是使用一些其他的数据库做为主数据库，然后使用Elasticsearch搜索数据，这意味着所有主数据库发生变化，就要将其拷贝到Elasticsearch中。如果有多个进程负责这些数据的同步，就会遇到上面提到的并发问题。
如果主数据库有版本字段——或一些类似于timestamp等可以用于版本控制的字段——是你就可以在Elasticsearch的查询字符串后面添加version_type=external来使用这些版本号。版本号必须是整数，大于零小于9.2e+18——Java中的正的long。
外部版本号与之前说的内部版本号在处理的时候有些不同。它不再检查_version是否与请求中指定的一致，而是检查是否小于指定的版本。如果请求成功，外部版本号就会被存储到_version中。


