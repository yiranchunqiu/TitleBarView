# 介绍
## 自用项目，自定义标题栏

### 图片
<div style="align: center">
       <img src="https://github.com/yiranchunqiu/TitleBarView/blob/master/pic/%E5%9B%BE%E7%89%871.png" width="32%">
</div>


### 使用方法
### 添加

```
allprojects {
 		repositories {
 			maven { url 'https://jitpack.io' }
 		}
 	}
```

### 添加依赖

```
 	dependencies {
    	        implementation 'com.github.yiranchunqiu:TitleBarView:1.0'
    	}
```

### 使用

```
<com.pxz.pxztitlebar.TitleBarView
                android:id="@+id/titleBarView8"
                android:layout_width="match_parent"
                android:layout_height="44dp"
                android:layout_marginTop="20dp"
                app:titleBarColor="@color/colorPrimary"
                app:leftOnePic="@mipmap/title_back_black"
                app:isLeftTwoPic="true"
                app:leftTwoPic="@mipmap/title_back_black"
                app:isRightOneText="true"
                app:rightOneText="副标题1"
                app:isRightTwoText="true"
                app:rightTwoText="副标题2"
                app:titleBarText="标题7" />
```
### 属性

| 名称 | 描述 |  默认值 |
|---|---|---|
| titleBarColor | 标题栏颜色 | colorPrimary |
| isLeft | 是否显示左边部分 | true |
| leftOnePic | 左边第一个按钮图片 | titile_back_white |
| isLeftOnePic | 左边第一个按钮图片是否显示 | true |
| leftTwoPic | 左边第二个按钮图片 | titile_back_white |
| isLeftTwoPic | 左边第二个按钮图片是否显示 | false |
| leftText | 左边文字 |  |
| isleftText | 左边文字是否显示 | true |
| leftTextColor | 左边文字颜色 | white |
| titleBarText | 标题栏文字 |  |
| titleBarTextColor | 标题栏文字颜色 | white |
| isRight | 是否显示右边部分 | true |
| rightOnePic | 右边第一个按钮图片 | titile_back_white |
| isRightOnePic | 右边第一个按钮图片是否显示 | false |
| rightTwoPic | 右边第二个按钮图片 | titile_back_white |
| isRightTwoPic | 右边第二个按钮图片是否显示 | false |
| rightOneText | 右边第一个文字副标题 |  |
| isRightOneText | 右边第一个文字副标题是否显示 | false |
| rightOneTextColor | 右边第一个文字副标题颜色 | white |
| rightTwoText | 右边第二个文字副标题 |  |
| isRightTwoText | 右边第二个文字副标题是否显示 | true |
| rightTwoTextColor | 右边第二个文字副标题颜色 | white |