fun hello(name: String = "World"): String {
  var result: String;
  if (!name.isNullOrBlank()){
    result = "Hello, " + name + "!";
  } else {
    result = "Hello, World!";
  }
  return result;
}
