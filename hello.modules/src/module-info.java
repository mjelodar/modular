module hello.modules {
    exports com.example.module.hello;
    provides com.example.module.hello.HelloInterface with com.example.module.hello.HelloModules;
}