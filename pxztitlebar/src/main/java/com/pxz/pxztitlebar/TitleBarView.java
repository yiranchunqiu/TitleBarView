package com.pxz.pxztitlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

/**
 * 类说明：标题栏
 * 联系：530927342@qq.com
 *
 * @author peixianzhong
 * @date 2019/9/25 10:42
 */
public class TitleBarView extends RelativeLayout {
    private RelativeLayout rlTitle;
    private LinearLayout llLeft;
    private ImageView ivLeftOne;
    private ImageView ivLeftTwo;
    private TextView tvLeft;
    private TextView tvTitleText;
    private LinearLayout llRight;
    private ImageView ivRightOne;
    private ImageView ivRightTwo;
    private TextView tvRightOne;
    private TextView tvRightTwo;
    /**
     * 标题栏颜色
     */
    private int titleBarColor = R.color.colorPrimary;
    /**
     * 是否显示左边部分
     */
    private boolean isLeft = true;
    /**
     * 左边第一个按钮图片
     */
    private int leftOnePic = R.mipmap.title_back_white;
    /**
     * 左边第一个按钮图片是否显示
     */
    private boolean isLeftOnePic = true;
    /**
     * 左边第二个按钮图片
     */
    private int leftTwoPic = R.mipmap.title_back_white;
    /**
     * 左边第二个按钮图片是否显示
     */
    private boolean isLeftTwoPic = false;
    /**
     * 左边文字
     */
    private String leftText = "返回";
    /**
     * 左边文字是否显示
     */
    private boolean isleftText = true;
    /**
     * 左边文字颜色
     */
    private int leftTextColor = R.color.white;
    /**
     * 标题栏文字
     */
    private String titleBarText = "标题";
    /**
     * 标题栏文字颜色
     */
    private int titleBarTextColor = R.color.white;
    /**
     * 是否显示右边部分
     */
    private boolean isRight = true;
    /**
     * 右边第一个按钮图片
     */
    private int rightOnePic = R.mipmap.title_back_white;
    /**
     * 右边第一个按钮图片是否显示
     */
    private boolean isRightOnePic = false;
    /**
     * 右边第二个按钮图片
     */
    private int rightTwoPic = R.mipmap.title_back_white;
    /**
     * 右边第二个按钮图片是否显示
     */
    private boolean isRightTwoPic = false;
    /**
     * 右边第一个文字副标题
     */
    private String rightOneText = "副标题1";
    /**
     * 右边第一个文字副标题是否显示
     */
    private boolean isRightOneText = false;
    /**
     * 右边第一个文字副标题颜色
     */
    private int rightOneTextColor = R.color.white;
    /**
     * 右边第二个文字副标题
     */
    private String rightTwoText = "副标题2";
    /**
     * 右边第二个文字副标题是否显示
     */
    private boolean isRightTwoText = true;
    /**
     * 右边第二个文字副标题颜色
     */
    private int rightTwoTextColor = R.color.white;

    private LlLeftInterface llLeftInterface;
    private IvLeftOneInterface ivLeftOneInterface;
    private IvLeftTwoInterface ivLeftTwoInterface;
    private TvLeftInterface tvLeftInterface;
    private IvRightOneInterface ivRightOneInterface;
    private IvRightTwoInterface ivRightTwoInterface;
    private TvRightOneInterface tvRightOneInterface;
    private TvRightTwoInterface tvRightTwoInterface;

    public TitleBarView(Context context) {
        this(context, null);
    }

    public TitleBarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TitleBarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initStyles(context, attrs, defStyleAttr);
        initView(context);
        initType(context);
        initClick();
    }

    private void initStyles(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TitleBarView, defStyleAttr, 0);
        titleBarColor = a.getResourceId(R.styleable.TitleBarView_titleBarColor, R.color.colorPrimary);
        isLeft = a.getBoolean(R.styleable.TitleBarView_isLeft, true);
        leftOnePic = a.getResourceId(R.styleable.TitleBarView_leftOnePic, R.mipmap.title_back_white);
        isLeftOnePic = a.getBoolean(R.styleable.TitleBarView_isLeftOnePic, true);
        leftTwoPic = a.getResourceId(R.styleable.TitleBarView_leftTwoPic, R.mipmap.title_back_white);
        isLeftTwoPic = a.getBoolean(R.styleable.TitleBarView_isLeftTwoPic, false);
        leftText = a.getString(R.styleable.TitleBarView_leftText);
        isleftText = a.getBoolean(R.styleable.TitleBarView_isleftText, true);
        leftTextColor = a.getResourceId(R.styleable.TitleBarView_leftTextColor, R.color.white);
        titleBarText = a.getString(R.styleable.TitleBarView_titleBarText);
        titleBarTextColor = a.getResourceId(R.styleable.TitleBarView_titleBarTextColor, R.color.white);
        isRight = a.getBoolean(R.styleable.TitleBarView_isRight, true);
        rightOnePic = a.getResourceId(R.styleable.TitleBarView_rightOnePic, R.mipmap.title_back_white);
        isRightOnePic = a.getBoolean(R.styleable.TitleBarView_isRightOnePic, false);
        rightTwoPic = a.getResourceId(R.styleable.TitleBarView_rightTwoPic, R.mipmap.title_back_white);
        isRightTwoPic = a.getBoolean(R.styleable.TitleBarView_isRightTwoPic, false);
        rightOneText = a.getString(R.styleable.TitleBarView_rightOneText);
        isRightOneText = a.getBoolean(R.styleable.TitleBarView_isRightOneText, true);
        rightOneTextColor = a.getResourceId(R.styleable.TitleBarView_rightOneTextColor, R.color.white);
        rightTwoText = a.getString(R.styleable.TitleBarView_rightTwoText);
        isRightTwoText = a.getBoolean(R.styleable.TitleBarView_isRightTwoText, false);
        rightTwoTextColor = a.getResourceId(R.styleable.TitleBarView_rightTwoTextColor, R.color.white);
        a.recycle();
    }

    private void initView(Context context) {
        View.inflate(context, R.layout.title_bar, this);
        rlTitle = findViewById(R.id.rl_title);
        llLeft = findViewById(R.id.ll_left);
        ivLeftOne = findViewById(R.id.iv_left_one);
        ivLeftTwo = findViewById(R.id.iv_left_two);
        tvLeft = findViewById(R.id.tv_left);
        tvTitleText = findViewById(R.id.tv_title_text);
        llRight = findViewById(R.id.ll_right);
        ivRightOne = findViewById(R.id.iv_right_one);
        ivRightTwo = findViewById(R.id.iv_right_two);
        tvRightOne = findViewById(R.id.tv_right_one);
        tvRightTwo = findViewById(R.id.tv_right_two);
    }

    private void initType(Context context) {
        //标题栏颜色
        rlTitle.setBackgroundResource(titleBarColor);
        //左边部分是否显示
        if (isLeft) {
            llLeft.setVisibility(VISIBLE);
        } else {
            llLeft.setVisibility(GONE);
        }
        //左边第一张图片
        if (isLeftOnePic) {
            ivLeftOne.setVisibility(VISIBLE);
        } else {
            ivLeftOne.setVisibility(GONE);
        }
        ivLeftOne.setImageResource(leftOnePic);
        //左边第二张图片
        if (isLeftTwoPic) {
            ivLeftTwo.setVisibility(VISIBLE);
        } else {
            ivLeftTwo.setVisibility(GONE);
        }
        ivLeftTwo.setImageResource(leftTwoPic);
        //左边文字
        if (isleftText) {
            tvLeft.setVisibility(VISIBLE);
        } else {
            tvLeft.setVisibility(GONE);
        }
        tvLeft.setText(leftText);
        tvLeft.setTextColor(ContextCompat.getColor(context, leftTextColor));
        //标题文字
        tvTitleText.setText(titleBarText);
        tvTitleText.setTextColor(ContextCompat.getColor(context, titleBarTextColor));
        //右边部分是否显示
        if (isRight) {
            llRight.setVisibility(VISIBLE);
        } else {
            llRight.setVisibility(GONE);
        }
        //右边第一张图片
        if (isRightOnePic) {
            ivRightOne.setVisibility(VISIBLE);
        } else {
            ivRightOne.setVisibility(GONE);
        }
        ivRightOne.setImageResource(rightOnePic);
        //右边第二张图片
        if (isRightTwoPic) {
            ivRightTwo.setVisibility(VISIBLE);
        } else {
            ivRightTwo.setVisibility(GONE);
        }
        ivRightTwo.setImageResource(rightTwoPic);
        //右边副标题1
        if (isRightOneText) {
            tvRightOne.setVisibility(VISIBLE);
        } else {
            tvRightOne.setVisibility(GONE);
        }
        tvRightOne.setText(rightOneText);
        tvRightOne.setTextColor(ContextCompat.getColor(context, rightOneTextColor));
        //右边副标题2
        if (isRightTwoText) {
            tvRightTwo.setVisibility(VISIBLE);
        } else {
            tvRightTwo.setVisibility(GONE);
        }
        tvRightTwo.setText(rightTwoText);
        tvRightTwo.setTextColor(ContextCompat.getColor(context, rightTwoTextColor));
    }

    private void initClick() {
        llLeft.setOnClickListener(v -> {
            if (llLeftInterface!=null){
                llLeftInterface.onClick();
            }
        });
        ivLeftOne.setOnClickListener(v -> {
            if (ivLeftOneInterface!=null){
                ivLeftOneInterface.onClick();
            }
        });
        ivLeftTwo.setOnClickListener(v -> {
            if (ivLeftTwoInterface!=null){
                ivLeftTwoInterface.onClick();
            }
        });
        tvLeft.setOnClickListener(v -> {
            if (tvLeftInterface!=null){
                tvLeftInterface.onClick();
            }
        });
        ivRightOne.setOnClickListener(v -> {
            if (ivRightOneInterface!=null){
                ivRightOneInterface.onClick();
            }
        });
        ivRightTwo.setOnClickListener(v -> {
            if (ivRightTwoInterface!=null){
                ivRightTwoInterface.onClick();
            }
        });
        tvRightOne.setOnClickListener(v -> {
            if (tvRightOneInterface!=null){
                tvRightOneInterface.onClick();
            }
        });
        tvRightTwo.setOnClickListener(v -> {
            if (tvRightTwoInterface!=null){
                tvRightTwoInterface.onClick();
            }
        });
    }

    public void setLlLeftInterface(LlLeftInterface llLeftInterface) {
        this.llLeftInterface = llLeftInterface;
    }

    public void setIvLeftOneInterface(IvLeftOneInterface ivLeftOneInterface) {
        this.ivLeftOneInterface = ivLeftOneInterface;
    }

    public void setIvLeftTwoInterface(IvLeftTwoInterface ivLeftTwoInterface) {
        this.ivLeftTwoInterface = ivLeftTwoInterface;
    }

    public void setTvLeftInterface(TvLeftInterface tvLeftInterface) {
        this.tvLeftInterface = tvLeftInterface;
    }

    public void setIvRightOneInterface(IvRightOneInterface ivRightOneInterface) {
        this.ivRightOneInterface = ivRightOneInterface;
    }

    public void setIvRightTwoInterface(IvRightTwoInterface ivRightTwoInterface) {
        this.ivRightTwoInterface = ivRightTwoInterface;
    }

    public void setTvRightOneInterface(TvRightOneInterface tvRightOneInterface) {
        this.tvRightOneInterface = tvRightOneInterface;
    }

    public void setTvRightTwoInterface(TvRightTwoInterface tvRightTwoInterface) {
        this.tvRightTwoInterface = tvRightTwoInterface;
    }

    /**
     * 设置左边第一个按钮图片
     */
    public void setLeftIvOne(int icon){
        ivLeftOne.setImageResource(icon);
    }

    /**
     * 设置左边第二个按钮图片
     */
    public void setLeftIvTwo(int icon){
        ivLeftTwo.setImageResource(icon);
    }

    /**
     * 设置左边文字
     */
    public void setLeftTextString(String string){
        tvLeft.setText(string);
    }

    /**
     * 设置主标题文字
     */
    public void setTitleBarTextString(String string){
        tvTitleText.setText(string);
    }

    /**
     * 设置右边第一个按钮图片
     */
    public void setRightIvOne(int icon){
        ivRightOne.setImageResource(icon);
    }

    /**
     * 设置右边第二个按钮图片
     */
    public void setRightIvTwo(int icon){
        ivRightTwo.setImageResource(icon);
    }

    /**
     * 设置右边第一个文字
     */
    public void setRightOneTextString(String string){
        tvRightOne.setText(string);
    }

    /**
     * 设置右边第二个文字
     */
    public void setRightTwoTextString(String string){
        tvRightTwo.setText(string);
    }

    public interface IvLeftOneInterface{
        /**
         * 点击事件
         */
        void onClick();
    }

    public interface LlLeftInterface{
        /**
         * 点击事件
         */
        void onClick();
    }

    public interface IvLeftTwoInterface{
        /**
         * 点击事件
         */
        void onClick();
    }

    public interface TvLeftInterface{
        /**
         * 点击事件
         */
        void onClick();
    }

    public interface IvRightOneInterface{
        /**
         * 点击事件
         */
        void onClick();
    }

    public interface IvRightTwoInterface{
        /**
         * 点击事件
         */
        void onClick();
    }

    public interface TvRightOneInterface{
        /**
         * 点击事件
         */
        void onClick();
    }

    public interface TvRightTwoInterface{
        /**
         * 点击事件
         */
        void onClick();
    }
}