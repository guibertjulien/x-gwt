package com.github.spirylics.xgwt.essential;

import jsinterop.annotations.JsFunction;

public abstract class Fn {
    private Fn() {
    }

    @JsFunction
    public interface NoArg {
        void e();
    }

    @JsFunction
    public interface Arg<A> {
        void e(A arg);
    }

    @JsFunction
    public interface ArgRet<A, R> {
        R e(A arg);
    }

    @JsFunction
    public interface Args {
        void e(Object... args);
    }
}
