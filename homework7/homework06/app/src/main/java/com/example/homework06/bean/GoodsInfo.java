package com.example.homework06.bean;

import com.example.homework06.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "鬼斩", "隼", "js12", "天斧100zx", "dooot羽毛球拍", "礼盒装球拍","胜利hx-6","战羽初级球拍"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "正品VICTOR胜利威克多TK-Onigiri突击鬼斩羽毛球拍全碳素单拍",
            "正品victor胜利羽毛球拍单拍TK-F小隼",
            "正品胜利VICTOR威克多急速JS12二代羽毛球拍JS12F 新色进攻型单拍 ",
            "尤尼克斯羽毛球拍YONEX官网正品男女yy耐用型进攻拍天斧100ZZ/ZX",
            "dooot羽毛球拍正品全碳素超轻耐用耐打进攻型成人专业训练单拍G1s",
            "62克全碳素超轻8U羽毛球拍单拍攻守兼备碳纤维专业羽毛球拍礼盒装",
            "胜利VICTOR羽毛球拍威克多耐打型全碳素纳米HX-6/7SP攻守兼备单拍",
            " 战羽羽毛球拍双拍超轻全碳素进攻型训练拍成人学生正品初学者套装"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {798, 548, 960, 1544, 549, 198,490,168};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.gs_s, R.drawable.xiaohua_s, R.drawable.js_s,
            R.drawable.rs_s, R.drawable.ks_s, R.drawable.ak_s, R.drawable.bk_s, R.drawable.ck_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.gs, R.drawable.xiaohua, R.drawable.js,
            R.drawable.rs, R.drawable.ks, R.drawable.ak,
            R.drawable.bk, R.drawable.ck
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
