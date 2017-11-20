#### 1.效果预览
---
![](https://github.com/xsy2015/ShowButtonLayout/blob/master/app/src/main/assets/simple.gif)
#### 2.如何使用该开源库
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
##### Step 3. 在xml文件中引用
```
<com.xsy.lib.ShowButtonLayout
        android:id="@+id/mShowBtnLayout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        />
```
##### Step 4.设置数据
```
 for (int i = 0; i < hotWords.length; i++) {
            TextView view = (TextView) LayoutInflater.from(this).inflate(R.layout.hot_search_tv, mShowBtnLayout, false);
            view.setText(hotWords[i]);
            view.setTag(hotWords[i]);
            view.setOnClickListener(new View.OnClickListener() {//设置点击事件
                @Override
                public void onClick(View view) {
                    String keyword = (String) view.getTag();
                    Toast.makeText(MainActivity.this,keyword,Toast.LENGTH_LONG).show();
                }
            });
            mShowBtnLayout.addView(view);//添加到该view中
        }
```
