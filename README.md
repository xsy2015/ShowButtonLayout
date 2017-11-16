#### 1.效果预览
---
![](https://github.com/xsy2015/ShowButtonLayout/blob/master/app/src/main/assets/simple.gif)
#### 2.如何添加该开源库
_ _ _
Gradle:

##### Step 1. 添加JitPack仓库

在当前项目的根目录下的 build.gradle 文件中添加如下内容:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
##### Step 2. 添加项目依赖
```
dependencies {
	        compile 'com.github.xsy2015:ShowButtonLayout:v1.0.1'
	}
```
