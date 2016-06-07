package org.logstash.dissect;

class DelimOne implements IDelim {
    private final byte b;
    private final String _string;
    private final int length = 1;

    public DelimOne(String delim) {
        _string = delim;
        b = delim.getBytes()[0];
    }

    @Override
    public int indexOf(byte[] text, int textStart) {
        for (int n = textStart; n < text.length; n++) {
            if (text[n] == b)
                return n;
        }
        return -1;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public String string() {
        return _string;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DelimOne{");
        sb.append("string='").append(_string);
        sb.append("', length=").append(length);
        sb.append('}');
        return sb.toString();
    }
}
