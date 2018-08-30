package droid.yutani.com.maptasks;

import com.google.android.gms.maps.model.LatLng;

public class Task {
    private String id;
    private String description;
    private LatLng start;
    private LatLng end;
    private boolean isComplete;

    public Task() { }

    public Task(String description, LatLng start, LatLng end) {
        this.id = "";
        this.description = description;
        this.start = start;
        this.end = end;
    }
}
