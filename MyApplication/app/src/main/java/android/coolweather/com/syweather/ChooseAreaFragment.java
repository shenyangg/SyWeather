package android.coolweather.com.syweather;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.coolweather.com.syweather.db.City;
import android.coolweather.com.syweather.db.County;
import android.coolweather.com.syweather.db.Province;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CM-NB1 on 2018/5/18.
 */

public class ChooseAreaFragment extends Fragment {
    public static final int LEVEL_PROVINCE = 0;
    public static final int LEVEL_CITY = 1;
    public static final int LEVEL_COUNTY = 2;
    private ProgressDialog progressDialog;
    private TextView titleText;
    private Button backButton;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> dataList = new ArrayList<>();
    /**
     * 省列表
    */
    private List<Province> provinceList;
    /**
     * 市列表
     */
    private List<City> cityList;
    /**
     * 县列表
     */
    private List<County> countyList;
    /**
     * 选中的省份
     */
    private Province selectedProvince;
    /**
     * 选中的城市
     */
    private City selectedCity;
    /**
     * 当前选中的级别
     */
    private int currentLevel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choose_area, container, false);
        titleText = (TextView) view.findViewById(R.id.title_text);
        backButton = (Button) view.findViewById(R.id.back_button);
        listView = (ListView) view.findViewById(R.id.list_view);
        adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_expandable_list_item_1,dataList);
        listView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (currentLevel == LEVEL_PROVINCE){
                    selectedProvince = provinceList.get(i);
                    queryCities();
                }else if (currentLevel == LEVEL_CITY){
                    selectedCity = cityList.get(i);
                    queryCounties();
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentLevel == LEVEL_COUNTY){
                    queryCities();
                }else if (currentLevel == LEVEL_CITY){
                    queryProvinces();
                }
            }
        });
        queryProvinces();
    }

    private void queryCities() {
    }
    private void queryCounties(){

    }
    private void queryProvinces(){

    }

}



//在 onCreateView()
//方法中先是获取到了一些控件的实例，然后去初始化了 ArrayAdapter，并将它设置为 ListView的
//        适配器。接着在 onActivityCreated() 方法中给 ListView和 Button设置了点击事件，到这里我
//        们的初始化工作就算是完成了。

//    在 onActivityCreated() 方法的最后，调用了 queryProvinces() 方法，也就是从这里开
//        始加载省级数据的。 queryProvinces() 方法中首先会将头布局的标题设置成中国，将返回按钮
//        隐藏起来，因为省级列表已经不能再返回了。然后调用 LitePal 的查询接口来从数据库中读取省
//        级数据，如果读取到了就直接将数据显示到界面上，如果没有读取到就按照 14.1 节讲述的接口
//        组装出一个请求地址，然后调用 queryFromServer() 方法来从服务器上查询数据。