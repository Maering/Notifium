package devmobile.hearc.ch.notifium.logicals.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

import devmobile.hearc.ch.notifium.logicals.conditions.ConditionBatteryLevel;

public class ConditionBatteryLevelSerializer implements JsonSerializer<ConditionBatteryLevel> {

    public JsonElement serialize(ConditionBatteryLevel cond, Type ConditionBatteryLevel, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.addProperty("threshold", cond.getThreshold());
        return object;
    }

}
