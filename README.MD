## 关于热修复 Bugly 的使用
- 接入bugly使用修复功能
- demo中有最简单的接入，参考demo即可
- 注意：上传补丁之前需要激活之前的基准包不然上传补丁会报错的

## 热修复步骤如下
1.首先打个正式版本的apk,打完后会在TestBuglyDemo\app\build\bakApk\app-0926-00-54-41生成基准包。

2.修复bug后先将tinker-support.gradle文件中的def baseApkDir = "app-0926-00-54-41"这行代码中的 app-0926-00-54-41 改为步骤1中生成基础包的日期app-0926-00-54-41

3.还要将tinker-support.gradle文件中 tinkerId = "base-1.0.1"改下id暴政这个id唯一,例如我改成 tinkerId = "path-1.0.1"

4,双击AS右边的gradle一次选择app->tinker-support->buildTinkerPathRelease这个命令生成补丁包即可

5.在TestBuglyDemo\app\build\outputs\patch\release\patch_signed_7zip.apk将生成的补丁包上传后Bugly后台即可

腾讯Bugly官方视频讲解：https://v.qq.com/s/videoplus/512786315#uin=9f3b4b1232819f453becd2356a3493c4

关于热更新推荐非常详细的一篇文章：https://www.cnblogs.com/huihuizhang/p/11216343.html
