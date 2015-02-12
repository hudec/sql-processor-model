package org.sqlproc.model.property;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class PojoAttrType {
    String name;
    int size;
    boolean nativeType;
    JvmParameterizedTypeReference type;
    String text;

    public PojoAttrType(String typeName, int size, JvmParameterizedTypeReference JvmParameterizedTypeReference) {
        this.type = JvmParameterizedTypeReference;
        // JvmPrimitiveTypeImplCustom
        this.nativeType = (type != null && type instanceof JvmPrimitiveType) ? true : false;
        this.size = size;

        String name = typeName;
        int ix = name.indexOf('(');
        int ix2 = (ix >= 0) ? name.indexOf(')', ix + 1) : -1;
        if (ix >= 0 && ix2 >= 0) {
            String num = name.substring(ix + 1, ix2);
            name = name.substring(0, ix);
            try {
                this.size = Integer.parseInt(num);
            } catch (NumberFormatException ignore) {
            }
        }
        this.name = name;
        ICompositeNode node = NodeModelUtils.getNode(JvmParameterizedTypeReference);
        this.text = node.getText();
        if (this.text.startsWith(":"))
            this.text = this.text.substring(1);
        if (this.text.startsWith(":"))
            this.text = this.text.substring(1);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isNativeType() {
        return nativeType;
    }

    public JvmParameterizedTypeReference getType() {
        return type;
    }

    // public boolean isArray() {
    // return array;
    // }
    //
    // public void setArray(boolean array) {
    // this.array = array;
    // }
    //
    // public PojoEntity getRef() {
    // return ref;
    // }
    //
    // public void setRef(PojoEntity ref) {
    // this.ref = ref;
    // }
    //
    // public String getText() {
    // return text;
    // }
    //
    // public void setText(String text) {
    // this.text = text;
    // }
    //
    // public JvmType getGtype() {
    // return gtype;
    // }
    //
    // public void setGtype(JvmType gtype) {
    // this.gtype = gtype;
    // }
    //
    // public PojoEntity getGref() {
    // return gref;
    // }
    //
    // public void setGref(PojoEntity gref) {
    // this.gref = gref;
    // }

    @Override
    public String toString() {
        return "PojoAttrType [name=" + name + ", size=" + size + "]";
    }
}
