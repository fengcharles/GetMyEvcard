# 这里说下这个项目的出处,以及开发想法

原本mytoy项目是用来测试一些开发用的小工具的.后来做成了一个Evcard 破解的抢车的web工具,当然现在已经不更新了,但是毕竟是码了那么久代码做出来的,虽然只有我一个人用,但是确实当时帮我了本大的忙,至少要知道认真对待一下,给她一个说明.

------------

## 为什么要开发这个项目?
2018年的时候找到了女朋友,当时因为没有车,出去玩的时候不方便.有一次,我在她家门口发现了有Evcard(共享租车),无意间就开启了练车的新大陆,经常通过他们的app租车出去玩.
那会他们网点的车,抢的比较火,经常app上看到有车,等到人走到网点的时候,已经被人抢掉了.而且他们的app也没有抢车的功能.使用起来非常的不方便.

后来我就想干脆破解他们app吧,看看能不能通过调用接口的方式,一旦在某一个时间某一个地点,出现我想要的车,就马上帮我抢下来.

------------


## 破解思路以及走的弯路
1. 通过Charles代理,找到主要的,车辆枚举,分布网点枚举接口,个人用户名,以及主要的下单接口. 这步非常容易.很快把接口以及提交的参数都整理出来了.
2. 由于他们接口调用都需要用户登陆的Token来做签名的参数,我就想如果我能知道他们的签名规则,很容易就实现了(事实上我想简单了,签名规则才是最难搞定的)
3. 我通过下载Android版本(为什么不用iOS? 因为我是java实在搞不懂iOS)的Evcard 想反编译,看看能不能从源代码中知道签名规则,毕竟我是一个老java,代码到手,还能破解不出来? (这步太幼稚了),很快就被app加固,打的鼻青脸肿,毛都没找到,并且了解到app加固源代码的机制.运行的代码都是放在内存里面的,除非通过高端的方式从内存里面dump出来.想想还是算了吧.
4. 既然破解签名的路子走不通,找找其他的漏洞了,研究了很长一段时时间,爱情的力量还是强大,漏洞被我找到了,他们的接口签名一旦生成,可以使用半个小时,并且业务参数可以随意变,不再签名当中.如果我拿到token以后调用任意一个接口,获取生成的签名.这个签名可以使用在任意接口上面.
5. 理论上只要我半个小时获取一次token,并且调用任意链接获取他们给定的签名就行.套在任意接口都能用.心动不如心动.开始设计,码代码.
###  设计思路:
           1、手机每隔半个小时点开一次app,我的服务器端通过代理方式可以获取到最新的token
           2、服务器端难道token保存下来.
           3、使用spring boot 的 themlefy页面,开发抢车管理页面,主要的功能就是选择网点,选择车型,选择电量范围,选择抢车时间.开始抢车.
           4、服务端接受到任务以后,拿着最新的Token调用接口,然后抢车,并下单.
           5、抢车成功以后下单,通过钉钉的机器人,发送消息给我.
