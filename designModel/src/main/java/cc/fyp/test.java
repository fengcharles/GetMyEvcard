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
            "    \"role_code\": \"shangpinfenlei-e\",\n" +
            "    \"title\": \"商品管理-商品-分类-删除\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiaoshoufenlei-e\",\n" +
            "    \"title\": \"商品管理-商品-分类-删除\"\n" +
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
            "    \"role_code\": \"pintuan-a\",\n" +
            "    \"title\": \"活动管理-拼团-活动列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-b\",\n" +
            "    \"title\": \"活动管理-拼团-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-b\",\n" +
            "    \"title\": \"活动管理-拼团-活动上下架、删除\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-b\",\n" +
            "    \"title\": \"活动管理-拼团-活动编辑保存\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-c\",\n" +
            "    \"title\": \"活动管理-拼团-商品列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-d\",\n" +
            "    \"title\": \"活动管理-拼团-商品开团人数-设置\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-d\",\n" +
            "    \"title\": \"活动管理-拼团-商品开团人数-查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-e\",\n" +
            "    \"title\": \"活动管理-拼团-商品上下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-e\",\n" +
            "    \"title\": \"活动管理-拼团-添加商品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-e\",\n" +
            "    \"title\": \"活动管理-拼团-商品列表选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-f\",\n" +
            "    \"title\": \"活动管理-拼团-商品长图设置\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-g\",\n" +
            "    \"title\": \"活动管理-拼团-商品排序设置\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-h\",\n" +
            "    \"title\": \"活动管理-拼团-查看数据\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-i\",\n" +
            "    \"title\": \"活动管理-拼团-查看数据-上下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-i\",\n" +
            "    \"title\": \"活动管理-拼团-数据设置\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-i\",\n" +
            "    \"title\": \"活动管理-拼团-数据设置-弹框查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"pintuan-i\",\n" +
            "    \"title\": \"活动管理-拼团-变更活动库存\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-a\",\n" +
            "    \"title\": \"活动管理-预售-活动列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-b\",\n" +
            "    \"title\": \"活动管理-预售-添加活动\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-b\",\n" +
            "    \"title\": \"活动管理-预售-活动上下架、删除\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-b\",\n" +
            "    \"title\": \"活动管理-预售-活动编辑\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-c\",\n" +
            "    \"title\": \"活动管理-预售-商品列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-d\",\n" +
            "    \"title\": \"活动管理-预售-商品上下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-d\",\n" +
            "    \"title\": \"活动管理-预售-商品列表选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-d\",\n" +
            "    \"title\": \"活动管理-预售-添加商品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-e\",\n" +
            "    \"title\": \"活动管理-预售-时间设置\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-f\",\n" +
            "    \"title\": \"活动管理-预售-商品排序设置\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-g\",\n" +
            "    \"title\": \"活动管理-预售-数据设置-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-h\",\n" +
            "    \"title\": \"活动管理-预售-数据设置\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-h\",\n" +
            "    \"title\": \"活动管理-预售-数据设置-上下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-h\",\n" +
            "    \"title\": \"活动管理-预售-数据设置-弹框查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yushou-h\",\n" +
            "    \"title\": \"活动管理-预售-变更活动库存\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-a\",\n" +
            "    \"title\": \"活动管理-拼团-活动列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-b\",\n" +
            "    \"title\": \"活动管理-拼团-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-b\",\n" +
            "    \"title\": \"活动管理-拼团-活动编辑保存\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-b\",\n" +
            "    \"title\": \"活动管理-拼团-活动上下架、删除\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-c\",\n" +
            "    \"title\": \"活动管理-新人专享-商品列表选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-d\",\n" +
            "    \"title\": \"活动管理-新人专享-添加商品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-d\",\n" +
            "    \"title\": \"活动管理-新人专享-查看数据-上下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-d\",\n" +
            "    \"title\": \"活动管理-拼团-商品列表选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-e\",\n" +
            "    \"title\": \"活动管理-新人专享-商品长图设置\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-f\",\n" +
            "    \"title\": \"活动管理-新人专享-商品排序\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-g\",\n" +
            "    \"title\": \"活动管理-新人专享-数据设置-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-h\",\n" +
            "    \"title\": \"活动管理-新人专享-数据设置-弹框查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-h\",\n" +
            "    \"title\": \"活动管理-新人专享-数据设置\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-h\",\n" +
            "    \"title\": \"活动管理-拼团-变更活动库存\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xianshitehui-h\",\n" +
            "    \"title\": \"活动管理-新人专享-数据设置-上下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-a\",\n" +
            "    \"title\": \"活动管理-拼团-活动列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-b\",\n" +
            "    \"title\": \"活动管理-开店礼包-添加活动\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-b\",\n" +
            "    \"title\": \"活动管理-拼团-活动编辑保存\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-c\",\n" +
            "    \"title\": \"活动管理-开店礼包-商品列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-d\",\n" +
            "    \"title\": \"活动管理-开店礼包-添加商品\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-d\",\n" +
            "    \"title\": \"活动管理-拼团-商品列表选择\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-e\",\n" +
            "    \"title\": \"活动管理-开店礼包-活动-设置图片\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-f\",\n" +
            "    \"title\": \"活动管理-开店礼包-设置商品-设置图片\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-g\",\n" +
            "    \"title\": \"活动管理-开店礼包-商品排序\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-h\",\n" +
            "    \"title\": \"活动管理-开店礼包-数据设置-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-i\",\n" +
            "    \"title\": \"活动管理-开店礼包-数据设置-弹框查看\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-i\",\n" +
            "    \"title\": \"活动管理-开店礼包-数据设置-上下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-i\",\n" +
            "    \"title\": \"活动管理-开店礼包-数据设置\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"kaidianlibao-i\",\n" +
            "    \"title\": \"活动管理-拼团-变更活动库存\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"guanggaowei-a\",\n" +
            "    \"title\": \"信息管理-站内广告-列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"guanggaowei-a\",\n" +
            "    \"title\": \"信息管理-站内广告-导入商品列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"guanggaowei-a\",\n" +
            "    \"title\": \"信息管理-站内广告-导入商品分类结构\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"guanggaowei-a\",\n" +
            "    \"title\": \"信息管理-站内广告-位置分类下拉列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"guanggaowei-a\",\n" +
            "    \"title\": \"信息管理-站内广告-商品导入加载列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"guanggaowei-a\",\n" +
            "    \"title\": \"信息管理-站内广告-上下架\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"guanggaowei-a\",\n" +
            "    \"title\": \"信息管理-站内广告-编辑广告\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"guanggaowei-a\",\n" +
            "    \"title\": \"信息管理-站内广告-添加广告\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"guanggaowei-a\",\n" +
            "    \"title\": \"信息管理-站内广告-删除广告\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"guanggaowei-a\",\n" +
            "    \"title\": \"信息管理-站内广告-保存编辑\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yanzhengma-a\",\n" +
            "    \"title\": \"信息管理-验证码-根据代码查询模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yanzhengma-a\",\n" +
            "    \"title\": \"信息管理-验证码-添加保存模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yanzhengma-a\",\n" +
            "    \"title\": \"信息管理-验证码-删除模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yanzhengma-a\",\n" +
            "    \"title\": \"信息管理-验证码-保存编辑模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yanzhengma-a\",\n" +
            "    \"title\": \"信息管理-验证码-编辑模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yanzhengma-a\",\n" +
            "    \"title\": \"信息管理-验证码-查询模板列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"apptuisong-a\",\n" +
            "    \"title\": \"信息管理-App推送-根据代码查询模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"apptuisong-a\",\n" +
            "    \"title\": \"信息管理-App推送-添加保存模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"apptuisong-a\",\n" +
            "    \"title\": \"信息管理-App推送-删除模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"apptuisong-a\",\n" +
            "    \"title\": \"信息管理-App推送-保存编辑模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"apptuisong-a\",\n" +
            "    \"title\": \"信息管理-App推送-编辑模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"apptuisong-a\",\n" +
            "    \"title\": \"信息管理-App推送查询模板列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-a\",\n" +
            "    \"title\": \"用户管理-用户管理-用户列表搜索\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-b\",\n" +
            "    \"title\": \"用户管理-用户管理-查看累计积分收益\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-b\",\n" +
            "    \"title\": \"用户管理-用户管理-查看积分类型\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-b\",\n" +
            "    \"title\": \"用户管理-用户管理-查看累计积分收益明细列表搜索\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-c\",\n" +
            "    \"title\": \"用户管理-用户管理-查看累计top券收益明细列表搜索\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-c\",\n" +
            "    \"title\": \"用户管理-用户管理-查看累计top券收益\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-c\",\n" +
            "    \"title\": \"用户管理-用户管理-查看top券类型\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-d\",\n" +
            "    \"title\": \"用户管理-用户管理-线下店铺业绩累计\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-d\",\n" +
            "    \"title\": \"用户管理-用户管理-查看店铺业绩累计明细列表搜索\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-e\",\n" +
            "    \"title\": \"用户管理-工单-更换手机号\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"yonghuguanli-f\",\n" +
            "    \"title\": \"用户管理-工单-申请解绑微信\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-a\",\n" +
            "    \"title\": \"用户管理-店铺管理-店铺列表搜索\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-b\",\n" +
            "    \"title\": \"用户管理-店铺管理-店铺业绩累计\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-b\",\n" +
            "    \"title\": \"用户管理-店铺管理-店铺业绩明细搜索\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-c\",\n" +
            "    \"title\": \"用户管理-店铺管理-店铺积分收益类型\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-c\",\n" +
            "    \"title\": \"用户管理-店铺管理-店铺收益明细\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-d\",\n" +
            "    \"title\": \"用户管理-店铺管理-批量发送短信\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-d\",\n" +
            "    \"title\": \"用户管理-店铺管理-修改店铺名称\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-d\",\n" +
            "    \"title\": \"用户管理-店铺管理-重置店铺名\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-e\",\n" +
            "    \"title\": \"用户管理-工单-申请解绑店铺\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-f\",\n" +
            "    \"title\": \"用户管理-店铺管理-查看店铺邀请开店搜索\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"dianpuguanli-g\",\n" +
            "    \"title\": \"用户管理-店铺管理-查看店铺邀请注册搜索\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"caozuojilu-a\",\n" +
            "    \"title\": \"用户管理-用户管理操作记录-查看操作列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"tixianjilu-a\",\n" +
            "    \"title\": \"提现模块-提现记录相关-提现列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"tixianjilu-a\",\n" +
            "    \"title\": \"提现模块-提现记录相关-操作成功/失败\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"tixianjilu-a\",\n" +
            "    \"title\": \"提现模块-提现记录相关-导入数据\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"tixianjilu-a\",\n" +
            "    \"title\": \"提现模块-提现记录相关-导出数据\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"tixianjilu-a\",\n" +
            "    \"title\": \"提现模块-提现记录相关-导出模板\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"tixianyinhangka-a\",\n" +
            "    \"title\": \"提现模块-银行管理-启用、停用\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"tixianyinhangka-a\",\n" +
            "    \"title\": \"提现模块-银行管理-银行编辑\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"tixianyinhangka-a\",\n" +
            "    \"title\": \"提现模块-银行管理-银行添加\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"tixianyinhangka-a\",\n" +
            "    \"title\": \"提现模块-银行管理-银行列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"tixianyinhangka-a\",\n" +
            "    \"title\": \"提现模块-银行管理-银行详情\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"banbenguanli-a\",\n" +
            "    \"title\": \"版本管理-版本页面-新增版本信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"banbenguanli-a\",\n" +
            "    \"title\": \"版本管理-版本页面-查询版本信息列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"banbenguanli-a\",\n" +
            "    \"title\": \"版本管理-版本页面-查询版本信息列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"weijinguanjianzi-a\",\n" +
            "    \"title\": \"系统模块-关键词维护-重载关键词\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"weijinguanjianzi-a\",\n" +
            "    \"title\": \"系统模块-关键字维护-根据id查询信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"weijinguanjianzi-a\",\n" +
            "    \"title\": \"系统模块-关键维护-根据id查询信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"weijinguanjianzi-a\",\n" +
            "    \"title\": \"系统模块-关键字维护-查询关键字类别\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"weijinguanjianzi-a\",\n" +
            "    \"title\": \"系统模块-关键字维护-编辑保存信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"weijinguanjianzi-a\",\n" +
            "    \"title\": \"系统模块-关键字维护-删除信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"weijinguanjianzi-a\",\n" +
            "    \"title\": \"系统模块-关键字维护-添加保存信息\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"weijinguanjianzi-a\",\n" +
            "    \"title\": \"系统模块-关键字维护-分页查询列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-编辑用户权限\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-用户已有权限组\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-获取全部菜单权限组\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-添加部门权限\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-获取部门已有权限\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-岗位/部门查询条件\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-部门已有菜单权限组\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-查询部门成员\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-获取部门列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-编辑部门\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-删除部门\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"bumenguanli-a\",\n" +
            "    \"title\": \"权限管理-部门管理-添加部门\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"chengyuanguanli-a\",\n" +
            "    \"title\": \"权限管理-用户管理-添加成员\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"chengyuanguanli-a\",\n" +
            "    \"title\": \"权限管理-用户管理-离职检查\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"chengyuanguanli-a\",\n" +
            "    \"title\": \"权限管理-用户管理-离职\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"chengyuanguanli-a\",\n" +
            "    \"title\": \"权限管理-用户管理-编辑\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"chengyuanguanli-a\",\n" +
            "    \"title\": \"权限管理-用户管理-重置密码\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"quanixanzuweihu-a\",\n" +
            "    \"title\": \"权限管理-权限组维护-编辑权限组\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"quanixanzuweihu-a\",\n" +
            "    \"title\": \"权限管理-权限组维护-添加权限组\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"quanixanzuweihu-a\",\n" +
            "    \"title\": \"权限管理-权限组维护-权限组列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"quanixanzuweihu-a\",\n" +
            "    \"title\": \"权限管理-权限组维护-删除\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"quanixanzuweihu-a\",\n" +
            "    \"title\": \"权限管理-权限组维护-菜单查询列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"quanixanzuweihu-a\",\n" +
            "    \"title\": \"权限管理-权限组维护-所有接口列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"xiugaimima-a\",\n" +
            "    \"title\": \"权限管理-修改后台用户密码\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"jiekouliebiao-a\",\n" +
            "    \"title\": \"权限管理-权限列表-权限列表\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"jiekouliebiao-a\",\n" +
            "    \"title\": \"权限管理-权限列表-编辑权限\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"jiekouliebiao-a\",\n" +
            "    \"title\": \"权限管理-权限列表-保存编辑权限\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"jiekouliebiao-a\",\n" +
            "    \"title\": \"权限管理-权限列表-添加权限\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"role_code\": \"jiekouliebiao-a\",\n" +
            "    \"title\": \"权限管理-权限列表-删除权限\"\n" +
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
