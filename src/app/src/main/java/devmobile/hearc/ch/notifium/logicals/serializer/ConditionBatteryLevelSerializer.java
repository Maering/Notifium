/**
 * Projet : Notifium
 * Students : Raphaël Margueron / Fabien Mottier / Segan Salomon
 * Teacher : Aicha Rizzotti
 * Module : 3255.1-Developpement_mobile
 * Repository Git : https://github.com/HE-Arc/Notifium
 * Date : 25.01.2019
 */
package devmobile.hearc.ch.notifium.logicals.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

import devmobile.hearc.ch.notifium.logicals.conditions.ConditionBatteryLevel;
import devmobile.hearc.ch.notifium.logicals.enums.ConditionType;

/**
 * Serializer for a condition to check the level of the batter
 */
public class ConditionBatteryLevelSerializer implements JsonSerializer<ConditionBatteryLevel> {

    public JsonElement serialize(ConditionBatteryLevel cond, Type ConditionBatteryLevel, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.addProperty("type", ConditionType.Battery.name()); // use to retrieve the type on load
        object.addProperty("threshold", cond.getThreshold());
        return object;
    }

}
