package gear.yc.com.gearapplication.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import gear.yc.com.gearapplication.R;
import gear.yc.com.gearapplication.pojo.User;

/**
 * GearApplication
 * Created by YichenZ on 2016/3/30 16:24.
 */
public class RecyclerListDemoAdapter extends RecyclerView.Adapter<RecyclerListDemoAdapter.DemoHolder>{

    List<User> mData;
    Context context;

    @Override
    public DemoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        DemoHolder demoHolder=new DemoHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_recycler_view,parent,false));
        return demoHolder;
    }

    @Override
    public void onBindViewHolder(DemoHolder holder, int position) {
        User data =mData.get(position);
        holder.name.setText(data.getUsername());
        holder.content.setText(data.getUid());
        holder.bgImage.setImageURI(Uri.parse(data.getHeadPortrait()));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public List<User> getmData() {
        return mData;
    }

    public RecyclerListDemoAdapter setmData(List<User> mData) {
        this.mData = mData;
        return this;
    }

    public RecyclerListDemoAdapter setContext(Context context) {
        this.context = context;
        return this;
    }

    class DemoHolder extends RecyclerView.ViewHolder{

        ImageView headPortrait;
        SimpleDraweeView bgImage;
        TextView name;
        TextView content;

        public DemoHolder(View itemView) {
            super(itemView);
            headPortrait=(ImageView)itemView.findViewById(R.id.iv_head_portrait);
            bgImage=(SimpleDraweeView)itemView.findViewById(R.id.sdv_bg_image);
            name=(TextView)itemView.findViewById(R.id.tv_name);
            content=(TextView)itemView.findViewById(R.id.tv_content);
        }
    }
}