package template.clase;

public abstract class MijlocTransport {

    protected abstract void opresteInStatia1();

    protected abstract void opresteInStatia2();

    protected abstract void opresteInStatia3();

    protected abstract void opresteInStatia4();

    protected abstract void opresteInStatia5();

    protected abstract void opresteInStatia6();

    public final void parcurgeTraseu() {

        opresteInStatia1();
        opresteInStatia2();
        opresteInStatia3();
        opresteInStatia4();
        opresteInStatia5();
        opresteInStatia6();
    }

    public final void parcurgeTraseuInvers() {

        opresteInStatia6();
        opresteInStatia5();
        opresteInStatia4();
        opresteInStatia3();
        opresteInStatia2();
        opresteInStatia1();
    }

}
