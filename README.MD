## 关于热修复 Bugly 的使用
- 接入bugly使用修复功能
- demo中有最简单的接入，参考demo即可
- 注意：上传补丁之前需要激活之前的基准包不然上传补丁会报错的

## 热修复步骤如下
1.首先打个正式版本的apk,打完后会在TestBuglyDemo\app\build\bakApk\app-0926-00-54-41生成基准包。

2.修复bug后先将tinker-support.gradle文件中的def baseApkDir = "app-0926-00-54-41"这行代码中的 app-0926-00-54-41 改为步骤1中生成基础包的日期app-0926-00-54-41

3.还要将tinker-support.gradle文件中 tinkerId = "base-1.0.1"改下id暴政这个id唯一,例如我改成 tinkerId = "path-1.0.1"

4,双击AS右边的gradle一次选择app->tinker-support->buildTinkerPathRelease这个命令生成补丁包即可

5.将生成的补丁包上传后bugly后台即可
