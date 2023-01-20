package uk.bs338.codeclan.javaAir.util;

/* This idea is from https://stackoverflow.com/a/50461711/19859074 */

public class NotImplementedException extends RuntimeException {
    /**
     * @deprecated Deprecated to remind you to implement the corresponding code
     *             before releasing the software.
     */
    @Deprecated
    public NotImplementedException()
    {
    }

    /**
     * @deprecated Deprecated to remind you to implement the corresponding code
     *             before releasing the software.
     */
    @Deprecated
    public NotImplementedException(String message)
    {
        super(message);
    }
}
