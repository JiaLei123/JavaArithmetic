/**
 * Created by JiaLei on 2016/9/12.
 */
public class SortSubject extends SubjectBase{
    @Override
    public void Dettach(IObserver observer) {
        if (this.Obserever.indexOf(observer) > 1) {
            this.Obserever.remove(this.Obserever.indexOf(observer));
        }
    }

    @Override
    public void Attach(IObserver observer) {
        if(!this.Obserever.contains(observer)){
            this.Obserever.add(observer);
        }
    }

    @Override
    public void NotifyObserver() {
        if (Obserever.size() > 0) {
            for (IObserver observer : Obserever
                    ) {
                observer.Update();
            }
        }
    }
}
