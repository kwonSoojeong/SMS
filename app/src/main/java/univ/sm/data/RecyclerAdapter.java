package univ.sm.data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import univ.sm.R;

import static android.R.id.list;

/**
 * Created by uaer on 2017-01-13.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    Context context;
    ArrayList<Shuttle> items;
    ArrayList<String> compareString;

    public void setItems(ArrayList<Shuttle> items) {
        this.items = items;
    }

    int directionFlag = 0;
    String pivotTime,startTitle,middleTitle,endTitle;
    /*정방향 역방향 레이아웃 구분*/
    int[] directionLayout = {
            R.layout.sch_detail_holder_opposite,
            R.layout.sch_detail_holder_reverse
    };

    @Override
    public long getItemId(int position) {
        return position;
    }

    public RecyclerAdapter(Context context, ArrayList<Shuttle> items, int directionFlag) {
        setHasStableIds(true);
        this.context = context;
        this.items = items;
        this.directionFlag = directionFlag;
        compareString = new ArrayList<String>();
        for(int i=1; i<items.size();i++){
            compareString.add(items.get(i).getB()[0]);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(directionLayout[directionFlag],null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Shuttle item = items.get(position+1);
        if(position == 0){
            item = items.get(0);
            pivotTime=item.getB()[0];
            startTitle=item.getB()[0];
            middleTitle=item.getB()[1];
            endTitle=item.getB()[2];
            item = items.get(position+1);
        }
        holder.indx.setText(item.getNo());
        holder.pivotTime.setText(item.getB()[0]);
        if(directionFlag == 0){
            holder.textSchduleFirst.setText(item.getB()[0]+" "+startTitle);
            holder.textSchduleSecond.setText(item.getB()[1]+" "+middleTitle);
            holder.textSchduleThird.setText(item.getB()[2]+" "+endTitle);
        }else{
            holder.textSchduleFirst.setText(startTitle+" "+item.getB()[0]);
            holder.textSchduleSecond.setText(middleTitle+" "+item.getB()[1]);
            holder.textSchduleThird.setText(endTitle+" "+item.getB()[2]);
        }
    }

    @Override
    public int getItemCount() {
        return this.items.size()-1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView pivotTime,textSchduleFirst,textSchduleSecond,textSchduleThird,indx;
        LinearLayout background_reverse,background_opposite;
        public ViewHolder(View itemView) {
            super(itemView);
            if(directionFlag == 0){
                background_opposite=(LinearLayout)itemView.findViewById(R.id.background_opposite);
                pivotTime=(TextView)itemView.findViewById(R.id.pivotTime_opposite);
                textSchduleFirst=(TextView)itemView.findViewById(R.id.textSchduleFirst_opposite);
                textSchduleSecond=(TextView)itemView.findViewById(R.id.textSchduleSecond_opposite);
                textSchduleThird=(TextView)itemView.findViewById(R.id.textSchduleThird_opposite);
                indx=(TextView)itemView.findViewById(R.id.indx_opposite);
            }else{
                background_reverse=(LinearLayout)itemView.findViewById(R.id.background_reverse);
                pivotTime=(TextView)itemView.findViewById(R.id.pivotTime_reverse);
                textSchduleFirst=(TextView)itemView.findViewById(R.id.textSchduleFirst_reverse);
                textSchduleSecond=(TextView)itemView.findViewById(R.id.textSchduleSecond_reverse);
                textSchduleThird=(TextView)itemView.findViewById(R.id.textSchduleThird_reverse);
                indx=(TextView)itemView.findViewById(R.id.indx_reverse);
            }
        }
    }
    public void clear(){
        items.clear();
        notifyDataSetChanged();
    }
    public void addAll(ArrayList<Shuttle> list){
        items.addAll(list);
        notifyDataSetChanged();
    }

    public int getMostFastIndex() {
        ArrayList<Integer> temp = getArray_String2Integer();
        long time = System.currentTimeMillis();
        SimpleDateFormat dayTime = new SimpleDateFormat("HH:mm");
        //비교할 대상 str
        int compare_time = 1250;/*Integer.parseInt((dayTime.format(new Date(time))).replace(":",""));*/
        int index=0;
        for(int i=0; i < temp.size();i++){

            if(compare_time > temp.get(i)){
                System.out.println("compare_time:::::"+compare_time+"temp.get("+i+")"+temp.get(i));
                index = i;
                //break;
            }
        }
        System.out.println("index:::::"+index);
        return index;
    }
    /*스트링형을 인트형으로 변환한 배열 반환*/
    public ArrayList<Integer> getArray_String2Integer() {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Iterator<String> tempString = compareString.iterator();
        while(tempString.hasNext()){
            temp.add(Integer.parseInt(tempString.next().replace(":","")));
        }
        return temp;
    }
}
