import KMMViewModelSwiftUI
import Shared
import SwiftUI

struct ContentView: View {
    @StateViewModel var viewModel = AppViewModel()
    let greet = Greeting().greet()

    var body: some View {
        Text(viewModel.input)
        TextField("Enter Input", text: $viewModel.input)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
