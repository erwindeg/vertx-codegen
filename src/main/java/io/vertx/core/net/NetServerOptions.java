package io.vertx.core.net;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@DataObject
public interface NetServerOptions {

  static NetServerOptions optionsFromJson(JsonObject json) {
    throw new UnsupportedOperationException();
  }
}
