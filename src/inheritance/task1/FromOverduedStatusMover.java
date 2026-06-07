package inheritance.task1;

public class FromOverduedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus){
            case AVAILABLE -> book.setStatus(Status.AVAILABLE);
            case ARCHIVED -> book.setStatus(Status.ARCHIVED);
            default -> System.out.format("Перевод книги из статуса '%s' в статус '%s' невозможен%n",
                    book.getStatus(), requestedStatus);
        }
    }
}
