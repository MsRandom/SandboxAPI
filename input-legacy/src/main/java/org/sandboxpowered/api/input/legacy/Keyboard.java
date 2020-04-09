package org.sandboxpowered.api.input.legacy;

import org.sandboxpowered.api.util.OperatingSystem;

public interface Keyboard {
    Key KEY_1 = new Key(0x02);
    Key KEY_2 = new Key(0x03);
    Key KEY_3 = new Key(0x04);
    Key KEY_4 = new Key(0x05);
    Key KEY_5 = new Key(0x06);
    Key KEY_6 = new Key(0x07);
    Key KEY_7 = new Key(0x08);
    Key KEY_8 = new Key(0x09);
    Key KEY_9 = new Key(0x0A);
    Key KEY_0 = new Key(0x0B);
    Key KEY_A = new Key(0x1E);
    Key KEY_B = new Key(0x30);
    Key KEY_C = new Key(0x2E);
    Key KEY_D = new Key(0x20);
    Key KEY_E = new Key(0x12);
    Key KEY_F = new Key(0x21);
    Key KEY_G = new Key(0x22);
    Key KEY_H = new Key(0x23);
    Key KEY_I = new Key(0x17);
    Key KEY_J = new Key(0x24);
    Key KEY_K = new Key(0x25);
    Key KEY_L = new Key(0x26);
    Key KEY_M = new Key(0x32);
    Key KEY_N = new Key(0x31);
    Key KEY_O = new Key(0x18);
    Key KEY_P = new Key(0x19);
    Key KEY_Q = new Key(0x10);
    Key KEY_R = new Key(0x13);
    Key KEY_S = new Key(0x1F);
    Key KEY_T = new Key(0x14);
    Key KEY_U = new Key(0x16);
    Key KEY_V = new Key(0x2F);
    Key KEY_W = new Key(0x11);
    Key KEY_X = new Key(0x2D);
    Key KEY_Y = new Key(0x15);
    Key KEY_Z = new Key(0x2C);
    Key ESCAPE = new Key(0x01);
    Key MINUS = new Key(0x0C);
    Key EQUALS = new Key(0x0D);
    Key BACKSPACE = new Key(0x0E);
    Key TAB = new Key(0x0F);
    Key LBRACKET = new Key(0x1A);
    Key RBRACKET = new Key(0x1B);
    Key RETURN = new Key(0x1C);
    Key SEMICOLON = new Key(0x27);
    Key APOSTROPHE = new Key(0x28);
    Key GRAVE = new Key(0x29);
    Key BACKSLASH = new Key(0x2B);
    Key COMMA = new Key(0x33);
    Key PERIOD = new Key(0x34);
    Key SLASH = new Key(0x35);
    Key NUMPAD_MULTIPLY = new Key(0x37);
    Key SPACE = new Key(0x39);
    Key CAPSLOCK = new Key(0x3A);

    //Functions
    Key FUNCTION = new Key(0xC4);
    Key FUN_1 = new Key(0x3B);
    Key FUN_2 = new Key(0x3C);
    Key FUN_3 = new Key(0x3D);
    Key FUN_4 = new Key(0x3E);
    Key FUN_5 = new Key(0x3F);
    Key FUN_6 = new Key(0x40);
    Key FUN_7 = new Key(0x41);
    Key FUN_8 = new Key(0x42);
    Key FUN_9 = new Key(0x43);
    Key FUN_10 = new Key(0x44);
    Key FUN_11 = new Key(0x57);
    Key FUN_12 = new Key(0x58);
    Key FUN_13 = new Key(0x64);
    Key FUN_14 = new Key(0x65);
    Key FUN_15 = new Key(0x66);
    Key FUN_16 = new Key(0x67);
    Key FUN_17 = new Key(0x68);
    Key FUN_18 = new Key(0x69);
    Key FUN_19 = new Key(0x71);

    //Numpad
    Key NUMPAD_0 = new Key(0x52);
    Key NUMPAD_1 = new Key(0x4F);
    Key NUMPAD_2 = new Key(0x50);
    Key NUMPAD_3 = new Key(0x51);
    Key NUMPAD_4 = new Key(0x4B);
    Key NUMPAD_5 = new Key(0x4C);
    Key NUMPAD_6 = new Key(0x4D);
    Key NUMPAD_7 = new Key(0x47);
    Key NUMPAD_8 = new Key(0x48);
    Key NUMPAD_9 = new Key(0x49);
    Key NUMPAD_SUBTRACT = new Key(0x4A);
    Key NUMPAD_ADD = new Key(0x4E);
    Key NUMPAD_DECIMAL = new Key(0X53);
    Key NUMPAD_EQUALS = new Key(0x8D);
    Key NUMPAD_ENTER = new Key(0x8C);
    Key NUMPAD_COMMA = new Key(0xB3);
    Key NUMPAD_DIVIDE = new Key(0xB5);
    Key NUMPAD_INSERT = new Key(0xD2);
    Key NUMPAD_DELETE = new Key(0xD3);

    Key NUMLOCK = new Key(0x45);
    Key SCROLLLOCK = new Key(0x46);

    //Japanese
    Key KANA = new Key(0x70);
    Key CONVERT = new Key(0x79);
    Key NOCONVERT = new Key(0x7B);
    Key YEN = new Key(0x7D);
    Key CIRCUMFLEX = new Key(0x90);
    Key KANJI = new Key(0x94);
    Key AX = new Key(0x96);

    Key AT = new Key(0x91);
    Key COLON = new Key(0x92);
    Key UNDERSCORE = new Key(0x93);
    Key UNLABELED = new Key(0x97);

    Key SECTION = new Key(0xA7);
    Key SYSRQ = new Key(0xB7);
    Key PAUSE = new Key(0xC5);
    Key HOME = new Key(0xC7);

    Key ARROW_UP = new Key(0xC8);
    Key ARROW_DOWN = new Key(0xD0);
    Key ARROW_LEFT = new Key(0xCB);
    Key ARROW_RIGHT = new Key(0xCD);

    Key PAGEDOWN = new Key(0xD1);
    Key PAGEUP = new Key(0xC9);

    Key END = new Key(0xCF);
    Key CLEAR = new Key(0xDA);

    Key.Modifier NONE = new Key.Modifier(0x00);

    Key.Modifier LMETA = new Key.Modifier(0xDB);
    Key.Modifier RMETA = new Key.Modifier(0xDC);

    Key.Modifier LWIN = new Key.Modifier(LMETA, OperatingSystem.WINDOWS); //Same as [LMETA] but only valid on windows
    Key.Modifier RWIN = new Key.Modifier(RMETA, OperatingSystem.WINDOWS); //Same as [RMETA] but only valid on windows

    Key.Modifier LCMD = new Key.Modifier(LMETA, OperatingSystem.MAC); //Same as [LMETA] but only valid on mac
    Key.Modifier RCMD = new Key.Modifier(RMETA, OperatingSystem.MAC); //Same as [RMETA] but only valid on mac

    Key.Modifier LCONTROL = new Key.Modifier(0x1D);
    Key.Modifier RCONTROL = new Key.Modifier(0x9D);
    Key.Modifier LSHIFT = new Key.Modifier(0x2A);
    Key.Modifier RSHIFT = new Key.Modifier(0x36);
    Key.Modifier RALT = new Key.Modifier(0xB8);
    Key.Modifier LALT = new Key.Modifier(0x38);

    boolean isKeyDown(Key key);

    boolean areKeysDown(Key... keys);

    class Key {
        protected final int key;

        public Key(int key) {
            this.key = key;
        }

        public Key(Key key) {
            this(key.key);
        }

        public int getKey() {
            return key;
        }

        public static class Modifier extends Key {
            private final OperatingSystem system;

            public Modifier(int key) {
                this(key, null);
            }

            public Modifier(int key, OperatingSystem system) {
                super(key);
                this.system = system;
            }

            public Modifier(Key key, OperatingSystem system) {
                super(key);
                this.system = system;
            }
        }
    }
}
