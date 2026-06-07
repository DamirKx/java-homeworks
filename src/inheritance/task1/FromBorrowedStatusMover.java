package inheritance.task1;

public class FromBorrowedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus){
            case AVAILABLE -> book.setStatus(Status.AVAILABLE);
            case OVERDUED -> book.setStatus(Status.OVERDUED);
            default -> System.out.format("Перевод книги из статуса '%s' в статус '%s' невозможен%n",
                    book.getStatus(), requestedStatus);
        }
    }
}
