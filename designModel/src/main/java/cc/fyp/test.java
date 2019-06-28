package cc.fyp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author von
 * @description:
 * @date 2019-06-2715:22
 */
public class test {


    public static String myjson = "[\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-a\",\n" +
            "    \"title\": \"商品查看-单品库-列表-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-a\",\n" +
            "    \"title\": \"商品查看-单品库-列表-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-a\",\n" +
            "    \"title\": \"商品查看-单品库-列表-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-a\",\n" +
            "    \"title\": \"商品查看-单品库-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-b\",\n" +
            "    \"title\": \"商品管理-单品库-添加商品-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-b\",\n" +
            "    \"title\": \"商品管理-单品库-添加商品-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-b\",\n" +
            "    \"title\": \"商品管理-单品库-添加商品-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-b\",\n" +
            "    \"title\": \"商品管理-单品库-添加商品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-c\",\n" +
            "    \"title\": \"商品管理-单品库-编辑-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-c\",\n" +
            "    \"title\": \"商品管理-单品库-编辑-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-c\",\n" +
            "    \"title\": \"商品管理-单品库-编辑-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-c\",\n" +
            "    \"title\": \"商品管理-单品库-编辑-保存\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-c\",\n" +
            "    \"title\": \"商品管理-单品库-编辑-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-d\",\n" +
            "    \"title\": \"商品管理-单品库-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-d\",\n" +
            "    \"title\": \"商品管理-单品库-查看-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-d\",\n" +
            "    \"title\": \"商品管理-单品库-查看-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-d\",\n" +
            "    \"title\": \"商品管理-单品库-查看-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-e\",\n" +
            "    \"title\": \"商品管理-单品库-淘汰、上架、下架、批量上架、批量下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-f\",\n" +
            "    \"title\": \"商品管理-单品库-导出商品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"danpinku-g\",\n" +
            "    \"title\": \"商品管理-单品库-同步到线下销售库\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshang-a\",\n" +
            "    \"title\": \"商品管理-商品-供应商-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshang-b\",\n" +
            "    \"title\": \"商品管理-商品-供应商-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshang-c\",\n" +
            "    \"title\": \"商品管理-商品-供应商-添加\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshang-d\",\n" +
            "    \"title\": \"商品管理-商品-供应商-编辑（必须有查看）\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshang-d\",\n" +
            "    \"title\": \"商品管理-商品-供应商-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-供应商订单-物流详情\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-供应商订单-修改订单备注\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-供应商订单-订单详细-参团人员信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-供应商订单-订单详细-组合商品sku信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-供应商订单-订单详细-参团人员信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-供应商订单-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-供应商订单-搜索\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshangdingdan-b\",\n" +
            "    \"title\": \"订单管理-供应商订单-下载供应商配货单\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"gongyingshangdingdan-b\",\n" +
            "    \"title\": \"订单管理-供应商订单-下载供应商配货单\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-a\",\n" +
            "    \"title\": \"商品查看-单品库-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-a\",\n" +
            "    \"title\": \"商品查看-单品库-列表-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-a\",\n" +
            "    \"title\": \"商品查看-单品库-列表-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-a\",\n" +
            "    \"title\": \"商品查看-单品库-列表-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-a\",\n" +
            "    \"title\": \"商品查看-单品库-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-a\",\n" +
            "    \"title\": \"商品查看-单品库-查看-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-a\",\n" +
            "    \"title\": \"商品查看-单品库-查看-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-a\",\n" +
            "    \"title\": \"商品查看-单品库-查看-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-b\",\n" +
            "    \"title\": \"商品查看-销售库-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-b\",\n" +
            "    \"title\": \"商品查看-销售库-查看-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-b\",\n" +
            "    \"title\": \"商品查看-销售库-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-b\",\n" +
            "    \"title\": \"商品查看-销售库-列表-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-b\",\n" +
            "    \"title\": \"商品查看-销售库-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-编辑\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-新增\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-查看-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-查看-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-查看-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-列表-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-列表-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinchakan-c\",\n" +
            "    \"title\": \"商品查看-线下销售库-列表-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinfenlei-a\",\n" +
            "    \"title\": \"商品管理-商品-分类-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinfenlei-a\",\n" +
            "    \"title\": \"商品管理-商品-分类-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinfenlei-b\",\n" +
            "    \"title\": \"商品管理-商品-分类-添加（必须有分类选择）\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinfenlei-b\",\n" +
            "    \"title\": \"商品管理-商品-分类-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinfenlei-c\",\n" +
            "    \"title\": \"商品管理-商品-分类-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinfenlei-c\",\n" +
            "    \"title\": \"商品管理-商品-分类-编辑\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinfenlei-d\",\n" +
            "    \"title\": \"商品管理-商品-分类-上升\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinfenlei-d\",\n" +
            "    \"title\": \"商品管理-商品-分类-下降\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinfenlei-d\",\n" +
            "    \"title\": \"商品管理-商品-分类-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinfenlei-e\",\n" +
            "    \"title\": \"商品管理-商品-分类-删除\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinguige-a\",\n" +
            "    \"title\": \"商品管理-商品-规格-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinguige-a\",\n" +
            "    \"title\": \"商品管理-商品-规格-列表（必须有分类选择）\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinguige-b\",\n" +
            "    \"title\": \"商品管理-商品-规格-添加规格值\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinguige-b\",\n" +
            "    \"title\": \"商品管理-商品-规格-添加规格名\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinguige-b\",\n" +
            "    \"title\": \"商品管理-商品-规格-添加规格值\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinguige-b\",\n" +
            "    \"title\": \"商品管理-商品-规格-添加的规格列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinpaixu-a\",\n" +
            "    \"title\": \"商品管理-商品排序-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinpaixu-a\",\n" +
            "    \"title\": \"商品管理-商品排序-一级分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinpaixu-b\",\n" +
            "    \"title\": \"商品管理-商品排序-修改\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinpinpai-a\",\n" +
            "    \"title\": \"商品管理-商品-品牌-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinpinpai-b\",\n" +
            "    \"title\": \"商品管理-商品-品牌-添加\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinpinpai-c\",\n" +
            "    \"title\": \"商品管理-商品-品牌-编辑（必须有查看）\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"shangpinpinpai-c\",\n" +
            "    \"title\": \"商品管理-商品-品牌-编辑查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-线上订单-查询是否有物流\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-线上订单-修改订单备注\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-线上订单-搜索\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-线上订单-列表-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-线上订单-订单详细-参团人员信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-线上订单-订单详细-组合商品sku信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangdingdan-a\",\n" +
            "    \"title\": \"订单管理-线上订单-订单详细\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangdingdan-b\",\n" +
            "    \"title\": \"订单管理-线上订单-下载订单\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-a\",\n" +
            "    \"title\": \"商品管理-销售库-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-a\",\n" +
            "    \"title\": \"商品管理-销售库-列表-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-销售库-添加商品(组合品)-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-销售库-添加商品-组合品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-销售库-添加商品-选择单品sku\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-销售库-添加商品-选择规格值\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-销售库-添加商品-选择规格名称\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-销售库-添加商品-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-销售库-添加商品-单品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-销售库-编辑-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-销售库-编辑-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-销售库-编辑-选择规格名称\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-销售库-编辑-选择规格值\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-销售库(单品)-编辑-保存\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-销售库(单品)-编辑-选择单品sku\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-销售库(组合品)-编辑-保存\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-销售库(组合品)-编辑-选择单品sku\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-销售库-编辑-淘汰、上架、下架、批量上架、批量下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-d\",\n" +
            "    \"title\": \"商品管理-销售库-查看-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-d\",\n" +
            "    \"title\": \"商品管理-销售库-查看-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-e\",\n" +
            "    \"title\": \"商品管理-销售库-编辑-淘汰、上架、下架、批量上架、批量下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshangxiaoshouku-f\",\n" +
            "    \"title\": \"商品管理-销售库-导出商品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiadingdan-a\",\n" +
            "    \"title\": \"订单管理-线下订单列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiadingdan-a\",\n" +
            "    \"title\": \"订单管理-线下订单详情\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiadingdan-b\",\n" +
            "    \"title\": \"订单管理-线下订单下载\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-a\",\n" +
            "    \"title\": \"商品管理-线下销售库-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-a\",\n" +
            "    \"title\": \"商品管理-线下销售库-列表-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-a\",\n" +
            "    \"title\": \"商品管理-线下销售库-列表-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-a\",\n" +
            "    \"title\": \"商品管理-线下销售库-列表-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-线下销售库-添加商品-校验仓库sku\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-线下销售库-添加商品-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-线下销售库-添加商品-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-线下销售库-添加商品-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-b\",\n" +
            "    \"title\": \"商品管理-线下销售库-添加商品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-线下销售库-编辑-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-线下销售库-编辑-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-线下销售库-编辑-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-线下销售库-编辑-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-线下销售库-导出商品标签\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-c\",\n" +
            "    \"title\": \"商品管理-线下销售库-预览商品标签\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-d\",\n" +
            "    \"title\": \"商品管理-线下销售库-查看-供应商选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-d\",\n" +
            "    \"title\": \"商品管理-线下销售库-查看-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-d\",\n" +
            "    \"title\": \"商品管理-线下销售库-查看-品牌选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-d\",\n" +
            "    \"title\": \"商品管理-线下销售库-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-d\",\n" +
            "    \"title\": \"商品管理-线下销售库-预览商品标签\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-d\",\n" +
            "    \"title\": \"商品管理-线下销售库-导出商品标签\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-e\",\n" +
            "    \"title\": \"商品管理-线下销售库-上架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-e\",\n" +
            "    \"title\": \"商品管理-线下销售库-淘汰\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-e\",\n" +
            "    \"title\": \"商品管理-线下销售库-下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-f\",\n" +
            "    \"title\": \"商品管理-线下销售库-导出商品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianxiaxiaoshouku-g\",\n" +
            "    \"title\": \"商品管理-线下销售库-同步到线上商品库\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-a\",\n" +
            "    \"title\": \"商品管理-商品-分类-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-a\",\n" +
            "    \"title\": \"商品管理-商品-分类-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-b\",\n" +
            "    \"title\": \"商品管理-商品-分类-添加（必须有分类选择）\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-b\",\n" +
            "    \"title\": \"商品管理-商品-分类-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-c\",\n" +
            "    \"title\": \"商品管理-商品-分类-编辑\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-c\",\n" +
            "    \"title\": \"商品管理-商品-分类-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-d\",\n" +
            "    \"title\": \"商品管理-商品-分类-上升\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-d\",\n" +
            "    \"title\": \"商品管理-商品-分类-下降\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-d\",\n" +
            "    \"title\": \"商品管理-商品-分类-分类选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-e\",\n" +
            "    \"title\": \"商品管理-商品-分类-删除\"\n" +
            "  }\n" +
            "]";

    static String sqlTem = "INSERT INTO top_role_access (role_id, accsess_id)  select tar.id, taa.id from top_admin_role tar,top_admin_access taa where tar.role_code = [role_code] and taa.title in ([titles]);";

    static String insertSqlTem = "insert into top_user_role (user_id,userType, role_id)  select  ,2,(select id from top_admin_role where role_code = [role_code]);";

    public static void main(String[] args) {

        JSONArray array = JSONArray.parseArray(myjson);
        List<KVNode> list = new ArrayList<>();
        for (Object o : array) {
            JSONObject a = (JSONObject) o;
            String role_code = a.getString("role_code");
            String title = a.getString("title");
            list.add(new KVNode(role_code,title));
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sbIn = new StringBuilder();
        Map<String, List<KVNode>> collects = list.stream().collect(Collectors.groupingBy(KVNode::getK));
        List<String> keys = list.stream().map(KVNode::getK).distinct().collect(Collectors.toList());

        collects.forEach((m,l)->{
            String x =  new String(sqlTem);
            String after = x.replace("[role_code]", "'" + m + "'");
            String newCols = l.stream().map(KVNode::getV).map(c->c="'"+c+"'").collect(Collectors.joining(","));
            after = after.replace("[titles]",  newCols);
            sb.append(after);
            sb.append("\n");
        });

        keys.forEach(s->{
            String y =  new String(insertSqlTem);
            String yafter = y.replace("[role_code]", "'" + s + "'");
            sbIn.append(yafter);
            sbIn.append("\n");
        });

        System.out.println(sb.toString());

        System.out.println(sbIn.toString());

    }


}
