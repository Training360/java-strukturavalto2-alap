package week13.day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TransferAggregator {

    public List<TransferPerClient> readTransfers(Path path) {
        List<String> lines = readLines(path);
        return summarize(lines);
    }

    private List<TransferPerClient> summarize(List<String> lines) {
        Map<String, TransferPerClient> transfers = new TreeMap<>();
        for (String line: lines) {
            String[] parts = line.split(",");
            String sourceClientId = parts[0];
            String targetClientId = parts[1];
            int amount = Integer.parseInt(parts[2]);

//            TransferPerClient source = findOrInsert(transfers, sourceClientId);
            TransferPerClient source = transfers.computeIfAbsent(sourceClientId,
                    k -> new TransferPerClient(sourceClientId));
            source.decrease(amount);

//            TransferPerClient target = findOrInsert(transfers, targetClientId);
            TransferPerClient target = transfers.computeIfAbsent(targetClientId,
                    k -> new TransferPerClient(targetClientId));
            target.increase(amount);
        }
        return new ArrayList<>(transfers.values());
    }

//    private TransferPerClient findOrInsert(Map<String, TransferPerClient> transfers, String clientId) {
//        TransferPerClient transfer = transfers.get(clientId);
//        if (transfer == null) {
//            transfer = new TransferPerClient(clientId);
//            transfers.put(clientId, transfer);
//        }
//        return transfer;
//    }

    private List<String> readLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {
        List<TransferPerClient> transfers = new TransferAggregator()
                .readTransfers(Paths.get("src\\main\\resources\\transfers.csv"));

        for (TransferPerClient transfer: transfers) {
            System.out.printf("%s %,12d %5d\n",
                    transfer.getClientId(), transfer.getSum(), transfer.getNumberOfTransactions());
        }
    }
}
